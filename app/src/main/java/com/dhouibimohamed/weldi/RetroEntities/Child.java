package com.dhouibimohamed.weldi.RetroEntities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child {

    @SerializedName("id_child")
    @Expose
    private Integer idChild;
    @SerializedName("nom")
    @Expose
    private String nom;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("score_maths")
    @Expose
    private Integer scoreMaths;
    @SerializedName("score_general")
    @Expose
    private Integer scoreGeneral;
    @SerializedName("score_arts")
    @Expose
    private Integer scoreArts;
    @SerializedName("score_tounsi")
    @Expose
    private Integer scoreTounsi;
    @SerializedName("score_cinema")
    @Expose
    private Integer scoreCinema;
    @SerializedName("score_sport")
    @Expose
    private Integer scoreSport;

    public Integer getIdChild() {
        return idChild;
    }

    public void setIdChild(Integer idChild) {
        this.idChild = idChild;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getScoreMaths() {
        return scoreMaths;
    }

    public void setScoreMaths(Integer scoreMaths) {
        this.scoreMaths = scoreMaths;
    }

    public Integer getScoreGeneral() {
        return scoreGeneral;
    }

    public void setScoreGeneral(Integer scoreGeneral) {
        this.scoreGeneral = scoreGeneral;
    }

    public Integer getScoreArts() {
        return scoreArts;
    }

    public void setScoreArts(Integer scoreArts) {
        this.scoreArts = scoreArts;
    }

    public Integer getScoreTounsi() {
        return scoreTounsi;
    }

    public void setScoreTounsi(Integer scoreTounsi) {
        this.scoreTounsi = scoreTounsi;
    }

    public Integer getScoreCinema() {
        return scoreCinema;
    }

    public void setScoreCinema(Integer scoreCinema) {
        this.scoreCinema = scoreCinema;
    }

    public Integer getScoreSport() {
        return scoreSport;
    }

    public void setScoreSport(Integer scoreSport) {
        this.scoreSport = scoreSport;
    }

}