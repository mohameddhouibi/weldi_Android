package com.dhouibimohamed.weldi.RetroEntities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Client {


    @SerializedName("id_user")
    @Expose
    private int idUser;
    @SerializedName("unique_id")
    @Expose
    private String uniqueId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("encrypted_password")
    @Expose
    private String encryptedPassword;
    @SerializedName("salt")
    @Expose
    private String salt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}
