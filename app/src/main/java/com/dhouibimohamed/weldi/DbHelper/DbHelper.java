package com.dhouibimohamed.weldi.DbHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.dhouibimohamed.weldi.Model.QuestionCompFunda;
import java.util.ArrayList;
import java.util.List;

public class DbHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "Quiz.db";
    private static final String TABLE_QUEST = "questOS";
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; //correct option
    private static final String KEY_OPTA= "opta"; //option a
    private static final String KEY_OPTB= "optb"; //option b
    private static final String KEY_OPTC= "optc"; //option c
    private static final String KEY_OPTD= "optd"; //option d
    private static final String KEY_CAT="category"; //category
    private static final String TABLE_QUEST1 = "questCompFunda";
    private static final String TABLE_QUEST2 = "questHardware";
    private static final String TABLE_QUEST3 = "questFinal";

    public static final String TABLE_SCORE="score";
    public static final String SCORE_KEY_ID="id";
    public static final String SCORE_KEY_SECTION="section";
    public static final String SCORE_KEY_CAT="category";
    public static final String SCORE_KEY_SCORE="score";

    private SQLiteDatabase dbase;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase=db;


        String sql1 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST1 + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT, "+KEY_OPTD+" TEXT, "+KEY_CAT+" TEXT)";
        db.execSQL(sql1);
        addQuestionsCompFunda();


        String sql4 = "CREATE TABLE IF NOT EXISTS "+ TABLE_SCORE+" ( "
                + SCORE_KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + SCORE_KEY_SECTION
                + " TEXT, " + SCORE_KEY_CAT+ " TEXT, "+ SCORE_KEY_SCORE+" INTEGER)";
        db.execSQL(sql4);
    }

    private void addQuestionsCompFunda() {
        QuestionCompFunda q101 = new QuestionCompFunda("What is the decimal equivalent of the binary number 10111","21","23","39","42","23","B");
        this.addQuestionCompFunda(q101);
        QuestionCompFunda q102 = new QuestionCompFunda("In order to write on a floppy disk with your IBM PC, you must first","digitize it","format it","compile it","hardware it","format it","B");
        this.addQuestionCompFunda(q102);
        QuestionCompFunda q103 = new QuestionCompFunda("What is the term for a temporary storage area tha componsates for differences in data rate and data flow between devices ?","Buffer","Bus","Channel","Modem","Buffer","B");
        this.addQuestionCompFunda(q103);
        QuestionCompFunda q104 = new QuestionCompFunda("How many colour dots make up one colour pixel on a screen ?","256","16","3","1","3","B");
        this.addQuestionCompFunda(q104);
        QuestionCompFunda q105 = new QuestionCompFunda("One of the things that separates a TERMINAL from a PC is that the terminal does not have a what ?","Keyboard","Monitor","Power Cord","CPU","CPU","B");
        this.addQuestionCompFunda(q105);
        QuestionCompFunda q106 = new QuestionCompFunda("Data is stored on diskette in what form ?","Ink","Laser Bubble","Magnetism","Circuits","Magnetism","B");
        this.addQuestionCompFunda(q106);
        QuestionCompFunda q107 = new QuestionCompFunda("The smallest visual element on a video monitor is called what ?","Character","Pixel","Byte","Kwerk","Pixel","B");
        this.addQuestionCompFunda(q107);
        QuestionCompFunda q108 = new QuestionCompFunda("The type of data storage that is considered to be volatile is ?","R-O-M","R-A-M","TAPE","DISK","R-A-M","B");
        this.addQuestionCompFunda(q108);
        QuestionCompFunda q109 = new QuestionCompFunda("What natural element is the primary ingredient in computer chips ?","Silicon","Carbon","Iron","Uranium","Silicon","B");
        this.addQuestionCompFunda(q109);
        QuestionCompFunda q110 = new QuestionCompFunda("Where do you find a write protect notch ?","On a computer chip","On a punched card","In a read only memory","On a floppy disk","On a floppy disk","B");
        this.addQuestionCompFunda(q110);
        QuestionCompFunda q111 = new QuestionCompFunda("Which of the following languages is more suited to a structured program?","PL/1","FORTRAN","BASIC","PASCAL","PASCAL","B");
        this.addQuestionCompFunda(q111);
        QuestionCompFunda q112 = new QuestionCompFunda("A computer assisted method for the recording and analyzing of existing or hypothetical systems is","Data transmission","Data flow","Data capture","Data processing","Data flow","B");
        this.addQuestionCompFunda(q112);
        QuestionCompFunda q113 = new QuestionCompFunda("The brain of any computer system is","ALU","CPU","Memory","Control unit","CPU","B");
        this.addQuestionCompFunda(q113);
        QuestionCompFunda q114 = new QuestionCompFunda("What difference does the 5th generation computer have from other generation computers?","Technological advancement","Scientific code","Object Oriented Programming","All of the above","Technological advancement","B");
        this.addQuestionCompFunda(q114);
        QuestionCompFunda q115 = new QuestionCompFunda("Which of the following computer language is used for artificial intelligence?","FORTRAN","PROLOG","C","COBOL","PROLOG","B");
        this.addQuestionCompFunda(q115);
        QuestionCompFunda q116 = new QuestionCompFunda("The tracks on a disk which can be accessed without repositioning the R/W heads is","Surface","Cylinder","Cluster","All of the above","Cylinder","B");
        this.addQuestionCompFunda(q116);
        QuestionCompFunda q117 = new QuestionCompFunda("Which of the following is the 1's complement of 10?","01","110","11","10","01","B");
        this.addQuestionCompFunda(q117);
        QuestionCompFunda q118 = new QuestionCompFunda("A section of code to which control is transferred when a processor is interrupted is known as","M","SVC","IP","MDR","M","B");
        this.addQuestionCompFunda(q118);
        QuestionCompFunda q119 = new QuestionCompFunda("Which part interprets program instructions and initiate control operations.","Input","Storage unit","Logic unit","Control unit","Control unit","B");
        this.addQuestionCompFunda(q119);
        QuestionCompFunda q120 = new QuestionCompFunda("The binary system uses powers of","2","10","8","16","2","B");
        this.addQuestionCompFunda(q120);
        QuestionCompFunda q121 = new QuestionCompFunda("A computer program that converts assembly language to machine language is","Compiler","Interpreter","Assembler","Comparator","Assembler","B");
        this.addQuestionCompFunda(q121);
        QuestionCompFunda q122 = new QuestionCompFunda("The time required for the fetching and execution of one simple machine instruction is","Delay time","CPU cycle","Real time","Seek time","CPU cycle","B");
        this.addQuestionCompFunda(q122);
        QuestionCompFunda q123 = new QuestionCompFunda("The time for which a piece of equipment operates is called","Seek time","Effective time","Access time","Real time","Effective time","B");
        this.addQuestionCompFunda(q123);
        QuestionCompFunda q124 = new QuestionCompFunda("Binary numbers need more places for counting because","They are always big numbers","Any no. of 0's can be added in front of them","Binary base is small","0's and l's have to be properly spaced apart","Binary base is small","B");
        this.addQuestionCompFunda(q124);
        QuestionCompFunda q125 = new QuestionCompFunda("Which access method is used for obtaining a record from a cassette tape?","Direct","Sequential","Random","All of the above","Sequential","B");
        this.addQuestionCompFunda(q125);
        QuestionCompFunda q126 = new QuestionCompFunda("Any type of storage that is used for holding information between steps in its processing is","CPU","Primary storage","Intermediate storage","Internal storage","Intermediate storage","B");
        this.addQuestionCompFunda(q126);
        QuestionCompFunda q127 = new QuestionCompFunda("A name applied by Intel corp. to high speed MOS technology is called","HDLC","LAP","HMOS","SDLC","HMOS","B");
        this.addQuestionCompFunda(q127);
        QuestionCompFunda q128 = new QuestionCompFunda("A program component that allows structuring of a program in an unusual way is known as","Correlation","Coroutine","Diagonalization","Quene","Coroutine","B");
        this.addQuestionCompFunda(q128);
        QuestionCompFunda q129 = new QuestionCompFunda("The radian of a number system","Is variable","Has nothing to do with digit position value","Equals the number of its distinct counting digits","Is always an even number","Equals the number of its distinct counting digits","B");
        this.addQuestionCompFunda(q129);
        QuestionCompFunda q130 = new QuestionCompFunda("The section of the CPU that selects, interprets and sees to the execution of program instructions","Memory","Register unit","Control unit","ALU","Control unit","B");
        this.addQuestionCompFunda(q130);
        QuestionCompFunda q131 = new QuestionCompFunda("Which type of system puts the user into direct conversation with the computer through a keyboard?","Real time processing","Interactive computer","Batch processing","Time sharing","Interactive computer","B");
        this.addQuestionCompFunda(q131);
        QuestionCompFunda q132 = new QuestionCompFunda("The term referring to evacuating the content of some part of the machine is known as","Dump","Enhancement","Down","Compiler","Dump","B");
        this.addQuestionCompFunda(q132);
        QuestionCompFunda q133 = new QuestionCompFunda("A single packet on a data link is known as","Path","Frame","Block","Group","Frame","B");
        this.addQuestionCompFunda(q133);
        QuestionCompFunda q134 = new QuestionCompFunda("The process of communicating with a file from a terminal is","Interactive","Interrogation","Heuristic","All of the above","Interrogation","B");
        this.addQuestionCompFunda(q134);
        QuestionCompFunda q135 = new QuestionCompFunda("A common boundary between two systems is called","Interdiction","Interface","Surface","None of the above","Interface","B");
        this.addQuestionCompFunda(q135);
        QuestionCompFunda q136 = new QuestionCompFunda("The examination and changing of single bits or small groups of his within a word is called","Bit","Byte","Bit manipulation","Bit slice","Bit manipulation","B");
        this.addQuestionCompFunda(q136);
        QuestionCompFunda q137 = new QuestionCompFunda("Which computer has been designed to be as compact as possible?","Mini","Super computer","Micro computer","Mainframe","Micro computer","B");
        this.addQuestionCompFunda(q137);
        QuestionCompFunda q138 = new QuestionCompFunda("Which method is used to connect a remote computer?","Device","Dialup","Diagnostic","Logic circuit","Dialup","B");
        this.addQuestionCompFunda(q138);
        QuestionCompFunda q139 = new QuestionCompFunda("How many bit code is used by Murray code for TELEPRINTER machines.","4","5","9","25","5","B");
        this.addQuestionCompFunda(q139);
        QuestionCompFunda q140 = new QuestionCompFunda("The symbols used in an assembly language are","Codes","Mnemonics","Assembler","All of the above","Mnemonics","B");
        this.addQuestionCompFunda(q140);
        QuestionCompFunda q141 = new QuestionCompFunda("The 2's complement of a binary no. is obtained by adding.....to its 1's complement.","0","1","10","12","1","B");
        this.addQuestionCompFunda(q141);
        QuestionCompFunda q142 = new QuestionCompFunda("A systems programming language for microcomputers in the Intel family is","PL/C","PL/CT","PL/M","PLA","PL/M","B");
        this.addQuestionCompFunda(q142);
        QuestionCompFunda q143 = new QuestionCompFunda("A datum that indicates some important state in the content of input or output is","Sequence","Sentinel","SIO","Sibling","Sentinel","B");
        this.addQuestionCompFunda(q143);
        QuestionCompFunda q144 = new QuestionCompFunda("Which is a non-standard version of a computing language?","PROLOG","APL","Army","PL/1","Army","B");
        this.addQuestionCompFunda(q144);
        QuestionCompFunda q145 = new QuestionCompFunda("Which of the following is still useful for adding numbers?","EDSAC","ENIAC","Abacus","UNIVAC","Abacus","B");
        this.addQuestionCompFunda(q145);
        QuestionCompFunda q146 = new QuestionCompFunda("The average time necessary for the correct sector of a disk to arrive at the read write head is _____","Down time","Seek time","Rotational delay","Access time","Rotational delay","B");
        this.addQuestionCompFunda(q146);
        QuestionCompFunda q147 = new QuestionCompFunda("A number that is used to control the form of another number is known as","Map","Mask","Mamtossa","Marker","Mask","B");
        this.addQuestionCompFunda(q147);
        QuestionCompFunda q148 = new QuestionCompFunda("A general purpose single-user microcomputer designed to be operated by one person at a time is","Special-purpose computer","KIPS","M","PC","PC","B");
        this.addQuestionCompFunda(q148);
        QuestionCompFunda q149 = new QuestionCompFunda("ASCII stands for","American standard code for information interchange","All purpose scientific code for information interchange","American security code for information interchange","American Scientific code for information interchange","American standard code for information interchange","B");
        this.addQuestionCompFunda(q149);
        QuestionCompFunda q150 = new QuestionCompFunda("Which device of computer operation dispenses with the use of the keyboard?","Joystick","Light pen","Mouse","Touch","Mouse","B");
        this.addQuestionCompFunda(q150);
        QuestionCompFunda q151 = new QuestionCompFunda("The microcomputer, Intel MCS-80 is based on the widely used Intel","8080 microprocessor","8085 microprocessor","8086 microprocessor","8082 microprocessor","8080 microprocessor","I");
        this.addQuestionCompFunda(q151);
        QuestionCompFunda q152 = new QuestionCompFunda("Which is a machine-oriented high-level language for the GEC 4080 series machines.","LOGO","SNOBOL","Babbage","ALGOL","Babbage","I");
        this.addQuestionCompFunda(q152);
        QuestionCompFunda q153 = new QuestionCompFunda("A program that is employed in the development, repair or enhancement of other programs is known as","System software","Software tool","Applications program","Utility program","Software tool","I");
        this.addQuestionCompFunda(q153);
        QuestionCompFunda q154 = new QuestionCompFunda("Any storage device added to a computer beyond the immediately usable main storage is known as","Floppy disk","Hard disk","Backing store","Punched card","Backing store","I");
        this.addQuestionCompFunda(q154);
        QuestionCompFunda q155 = new QuestionCompFunda("Which output device is used for translating information from a computer into pictorial form on paper.","Mouse","Plotter","Touch panel","Card punch","Plotter","I");
        this.addQuestionCompFunda(q155);
        QuestionCompFunda q156 = new QuestionCompFunda("The list of coded instructions is called","Computer program","Algorithm","Flowchart","Utility programs","Computer program","I");
        this.addQuestionCompFunda(q156);
        QuestionCompFunda q157 = new QuestionCompFunda("A technique used by codes to convert an analog signal into a digital bit stream is known as","Pulse code modulation","Pulse stretcher","Query processing","Queue management","Pulse code modulation","I");
        this.addQuestionCompFunda(q157);
        QuestionCompFunda q158 = new QuestionCompFunda("An optical input device that interprets pencil marks on paper media is","O.M.R","Punch card reader","Optical scanners","Magnetic tape","O.M.R","I");
        this.addQuestionCompFunda(q158);
        QuestionCompFunda q159 = new QuestionCompFunda("Most important advantage of an IC is its","Easy replacement in case of circuit failure","Extremely high reliability","Reduced cost","Low power consumption","Extremely high reliability","I");
        this.addQuestionCompFunda(q159);
        QuestionCompFunda q160 = new QuestionCompFunda("Data division is the third division of a _____ program.","COBOL","BASIC","PASCAL","FORTH","COBOL","I");
        this.addQuestionCompFunda(q160);
        QuestionCompFunda q161 = new QuestionCompFunda("Which language was devised by Dr. Seymour Aubrey Papert?","APL","COBOL","LOGO","FORTRAN","LOGO","I");
        this.addQuestionCompFunda(q161);
        QuestionCompFunda q162 = new QuestionCompFunda("A program that converts computer data into some code system other than the normal one is known as","Encoder","Simulation","Emulator","Coding","Encoder","I");
        this.addQuestionCompFunda(q162);
        QuestionCompFunda q163 = new QuestionCompFunda("A device designed to read information encoded into a small plastic card is","Magnetic tape","Badge reader","Tape puncher","Card puncher","Badge reader","I");
        this.addQuestionCompFunda(q163);
        QuestionCompFunda q164 = new QuestionCompFunda("A hybrid computer uses a _____ to convert digital signals from a computer into analog signals.","Modulator","Demodulator","Modem","Decoder","Modem","I");
        this.addQuestionCompFunda(q164);
        QuestionCompFunda q165 = new QuestionCompFunda("A group of magnetic tapes, videos or terminals usually under the control of one master is","Cylinder","Cluster","Surface","Track","Cluster","I");
        this.addQuestionCompFunda(q165);
        QuestionCompFunda q166 = new QuestionCompFunda("Any device that performs signal conversion is","Modulator","Modem","Keyboard","Plotter","Modulator","I");
        this.addQuestionCompFunda(q166);
        QuestionCompFunda q167 = new QuestionCompFunda("Codes consisting of light and dark marks which may be optically read is known as","Mnemonics","Bar code","Decoder","All of the above","Bar code","I");
        this.addQuestionCompFunda(q167);
        QuestionCompFunda q168 = new QuestionCompFunda("A type of channel used to connect a central processor and peripherals which uses multipling is known as","Modem","Network","Multiplexer","All of the above","Multiplexer","I");
        this.addQuestionCompFunda(q168);
        QuestionCompFunda q169 = new QuestionCompFunda("The first generation of computers available was based on the bit micro processors.","4","8","16","64","8","I");
        this.addQuestionCompFunda(q169);
        QuestionCompFunda q170 = new QuestionCompFunda("The complete picture of data stored in database is known as","Record","Schema","System flowchart","DBMS","Schema","I");
        this.addQuestionCompFunda(q170);
        QuestionCompFunda q171 = new QuestionCompFunda("Which of the following is intended to be used in all applications runs on mainframe computers.","LOGO","APL","PL/1","OCCAM","PL/1","I");
        this.addQuestionCompFunda(q171);
        QuestionCompFunda q172 = new QuestionCompFunda("A language which is close to that used within the computer is","High-level language","Assembly language","Low-level language","All of the above","Low-level language","I");
        this.addQuestionCompFunda(q172);
        QuestionCompFunda q173 = new QuestionCompFunda("Which is a unit representing the no bits of discrete.","Baud","Byte","Bit","All of the above","Baud","I");
        this.addQuestionCompFunda(q173);
        QuestionCompFunda q174 = new QuestionCompFunda("The device that can both feed data into and accept data from a computer is","ALU","CPU","Input-Output device","All of the above","Input-Output device","I");
        this.addQuestionCompFunda(q174);
        QuestionCompFunda q175 = new QuestionCompFunda("The personnel who deals with the computer & its management put together are called","Software","Humanware","Firmware","Hardware","Humanware","I");
        this.addQuestionCompFunda(q175);
        QuestionCompFunda q176 = new QuestionCompFunda("A modern digital computer has","Extremely high speed","Large memory","Almost unlimited array","All of the above","All of the above","I");
        this.addQuestionCompFunda(q176);
        QuestionCompFunda q177 = new QuestionCompFunda("Which of the following can store information in the form of microscopic pits on metal disks.","Laser disks","Tape cassettes","RAM cartridge","Punched cards","Laser disks","I");
        this.addQuestionCompFunda(q177);
        QuestionCompFunda q178 = new QuestionCompFunda("A device for converting handwritten impressions into coded characters & positional coordinates for input to a computer is","Touch panel","Mouse","Wand","Writing tablet","Writing tablet","I");
        this.addQuestionCompFunda(q178);
        QuestionCompFunda q179 = new QuestionCompFunda("A storage system for small amounts of data is","Magnetic card","Magnetic tape","Punched card","Optical mark reader","Magnetic card","I");
        this.addQuestionCompFunda(q179);
        QuestionCompFunda q180 = new QuestionCompFunda("Which is another name for functional language?","Machine","Application language","Low-level language","High-level language","Application language","I");
        this.addQuestionCompFunda(q180);
        QuestionCompFunda q181 = new QuestionCompFunda("Compilers and interpreters are themselves","High-level language","Codes","Programs","Mnemonics","Programs","I");
        this.addQuestionCompFunda(q181);
        QuestionCompFunda q182 = new QuestionCompFunda("A compiler means","A person who compiles source programs","The same thing as a programmer","Keypunch operator","A program which translates source program into object program","A program which translates source program into object program","I");
        this.addQuestionCompFunda(q182);
        QuestionCompFunda q183 = new QuestionCompFunda("A pen shaped device which can sense light, and is used to point at spots on a video screen.","Mouse","Light pen","Joystick","Plotter","Light pen","I");
        this.addQuestionCompFunda(q183);
        QuestionCompFunda q184 = new QuestionCompFunda("A notation used to express clearly on algorithm is known as","Algorithmic language","Assembly language","Machine language","High level language","Algorithmic language","I");
        this.addQuestionCompFunda(q184);
        QuestionCompFunda q185 = new QuestionCompFunda("Compression of digital data for efficient storage is","Buffer","CPU","Packing","Field","Packing","I");
        this.addQuestionCompFunda(q185);
        QuestionCompFunda q186 = new QuestionCompFunda("An operating system intended for use on microprocessor based systems that support a single user is","PC-DOS","MS-DOS","UNIX","CP/M","CP/M","I");
        this.addQuestionCompFunda(q186);
        QuestionCompFunda q187 = new QuestionCompFunda("Which programming language is based on Algol 60.","PILOT","SNOBOL","ADA","SIMULA","SIMULA","I");
        this.addQuestionCompFunda(q187);
        QuestionCompFunda q188 = new QuestionCompFunda("Computer memory consists of","RAM","ROM","PROM","All of the above","All of the above","I");
        this.addQuestionCompFunda(q188);
        QuestionCompFunda q189 = new QuestionCompFunda("A path by which communication is achieved between a central processor and other devices is called","Audit trail","Network","Bus","Channel","Bus","I");
        this.addQuestionCompFunda(q189);
        QuestionCompFunda q190 = new QuestionCompFunda("A stand-alone system which produces one page of printed output at a time is","Page printer","Line printer","Laser printer","Dot matrix printer","Page printer","I");
        this.addQuestionCompFunda(q190);
        QuestionCompFunda q191 = new QuestionCompFunda("A memory that does not change its contents without external causes is known as","Dynamic memory","Static memory","RAM","EEPROM","Static memory","I");
        this.addQuestionCompFunda(q191);
        QuestionCompFunda q192 = new QuestionCompFunda("The report card and merit list forms the","Output data","Data processing","Central Processing","Input data","Output data","I");
        this.addQuestionCompFunda(q192);
        QuestionCompFunda q193 = new QuestionCompFunda("A number which is stored and processed but not in the standard exponential form is called","Floating point number","Fixed point number","Octal number","Decimal number","Fixed point number","I");
        this.addQuestionCompFunda(q193);
        QuestionCompFunda q194 = new QuestionCompFunda("A memory that holds micro programs is","Core memory","ROM","RAM","Control memory","ROM","I");
        this.addQuestionCompFunda(q194);
        QuestionCompFunda q195 = new QuestionCompFunda("A device invented by Dr. Bobeck in 1966, for mass storage of data is","Punched paper tape","Magnetic bubble storage","Magnetic tape","Magnetic disk","Magnetic bubble storage","I");
        this.addQuestionCompFunda(q195);
        QuestionCompFunda q196 = new QuestionCompFunda("The organization and interconnection of the various components of a computer system is","Architecture","Networks","Graphics","Designing","Architecture","I");
        this.addQuestionCompFunda(q196);
        QuestionCompFunda q197 = new QuestionCompFunda("Which of the following is the coding of data so that is can't be easily understood if intercepted.","Barcode","Decoder","Encryption","Mnemonics","Encryption","I");
        this.addQuestionCompFunda(q197);
        QuestionCompFunda q198 = new QuestionCompFunda("RAM is used as a short memory because it is","Volatile","Has small capacity","Is very expensive","Is programmable","Volatile","I");
        this.addQuestionCompFunda(q198);
        QuestionCompFunda q199 = new QuestionCompFunda("A modern electronic computer is a machine that is meant for","Doing quick mathematical calculations","Input storage, manipulation of outputting of data","Electronic data processing","Performing repetitive tasks accurately","Input storage, manipulation of outputting of data","I");
        this.addQuestionCompFunda(q199);
        QuestionCompFunda q200 = new QuestionCompFunda("Which is a device that changes information into digital form?","Modem","Digitizer","Mouse","Light pen","Digitizer","I");
        this.addQuestionCompFunda(q200);
        QuestionCompFunda q201 = new QuestionCompFunda("Which one of the following four words is odd?","Application","Peripheral","Program","Software","Peripheral","E");
        this.addQuestionCompFunda(q201);
        QuestionCompFunda q202 = new QuestionCompFunda("A CPU contains","a card reader","an analytical engine","control unit and ALU","only ALU","control unit and ALU","E");
        this.addQuestionCompFunda(q202);
        QuestionCompFunda q203 = new QuestionCompFunda("Which of the following controls the process of interaction between the user and the operating system?","user interface","language translator","platform","screen saver","user interface","E");
        this.addQuestionCompFunda(q203);
        QuestionCompFunda q204= new QuestionCompFunda("The first computers were programmed using","assembly language","machine language","source code","object code","machine language","E");
        this.addQuestionCompFunda(q204);
        QuestionCompFunda q205= new QuestionCompFunda("Is a combination of hardware and software that facilitates the sharing of information between computing devices","network","peripheral","expansion board","digital device","network","E");
        this.addQuestionCompFunda(q205);
        QuestionCompFunda q206= new QuestionCompFunda("The settings automatic and standard are called as","default","icon","CPU","custom","default","E");
        this.addQuestionCompFunda(q206);
        QuestionCompFunda q207= new QuestionCompFunda("Coded entries which are used to gain access to a computer system are called","entry codes","passwords","security commands","code words","passwords","E");
        this.addQuestionCompFunda(q207);
        QuestionCompFunda q208= new QuestionCompFunda("You can organize files by storing them in","archives","folders","indexes","lists","folders","E");
        this.addQuestionCompFunda(q208);
        QuestionCompFunda q209= new QuestionCompFunda("How many different documents can you have open at any one time ?","not more than 3","only one","as many as your computer memory will hold","maximum five","as many as your computer memory will hold","E");
        this.addQuestionCompFunda(q209);
        QuestionCompFunda q210= new QuestionCompFunda("Directory in directory is called","mini directory","junior directory","part directory","sub directory","sub directory","E");
        this.addQuestionCompFunda(q210);
        QuestionCompFunda q211= new QuestionCompFunda("Saving is a process","To copy the document from memory to storage medium","To bring change in present status of the document","To change the face or entire form","To develop the document by recording the text with the use of keyboard","To copy the document from memory to storage medium","E");
        this.addQuestionCompFunda(q211);
        QuestionCompFunda q212= new QuestionCompFunda("Junk email is also called-","spam","spoof","sniffer script","spool","spam","E");
        this.addQuestionCompFunda(q212);
        QuestionCompFunda q213= new QuestionCompFunda("What type of computers are client computers?","Mainframe","Mini-computer","Micro-computer","PDA","Micro-computer","E");
        this.addQuestionCompFunda(q213);
        QuestionCompFunda q214= new QuestionCompFunda("Hackers-","all have same motive","break into other people computers","computer scientist","are good people","break into other people computers","E");
        this.addQuestionCompFunda(q214);
        QuestionCompFunda q215= new QuestionCompFunda("A computer cannot boot if it does not have","compiler","loader","operating system","assembler","operating system","E");
        this.addQuestionCompFunda(q215);
        QuestionCompFunda q216= new QuestionCompFunda("Example of non numeric data","address","exam score","bank balance","all of these","address","E");
        this.addQuestionCompFunda(q216);
        QuestionCompFunda q217= new QuestionCompFunda("First page of website-","home page","index","javascript","bookmark","home page","E");
        this.addQuestionCompFunda(q217);
        QuestionCompFunda q218= new QuestionCompFunda("The appearance of typed characters is-","size","format","point","color","format","E");
        this.addQuestionCompFunda(q218);
        QuestionCompFunda q219= new QuestionCompFunda("Office LANS, which are scattered geographically on large scale, can be connected by the use of corporate-","CAN","MAN","LAN","WAN","WAN","E");
        this.addQuestionCompFunda(q219);
        QuestionCompFunda q220= new QuestionCompFunda("Where are data and program stored when the processor uses them?","main memory","secondary memory","disk","program memory","main memory","E");
        this.addQuestionCompFunda(q220);
        QuestionCompFunda q221= new QuestionCompFunda("If the file saved earlier is edited, then-","It is essential to save the file again to store the change","The change will automatically be saved in the file","If the length is more than a page, the file will be needed to be saved","The name will be needed to be changed","It is essential to save the file again to store the change","E");
        this.addQuestionCompFunda(q221);
        QuestionCompFunda q222= new QuestionCompFunda("CAD stands for","Computer aided design","Computer algorithm for design","Computer application in design","All of the above","Computer aided design","E");
        this.addQuestionCompFunda(q222);
        QuestionCompFunda q223= new QuestionCompFunda("The word FTP stands for","File Transit Protocol","File Translate Protocol","File Transfer Protocol","File Typing Protocol","File Transfer Protocol","E");
        this.addQuestionCompFunda(q223);
        QuestionCompFunda q224= new QuestionCompFunda("Memory which forgets everything when you switch off the power is known as","Corrupted","Volatile","Non Volatile","Non Corrupted","Volatile","E");
        this.addQuestionCompFunda(q224);
        QuestionCompFunda q225= new QuestionCompFunda("The linking of computers with a communication system is called","networking","pairing","locking","assembling","networking","E");
        this.addQuestionCompFunda(q225);
        QuestionCompFunda q226= new QuestionCompFunda("The 16 bit Microprocessor means that it has","16 address lines","16 bus","16 data lines","16 routes","16 data lines","E");
        this.addQuestionCompFunda(q226);
        QuestionCompFunda q227= new QuestionCompFunda("Data going into the computers is called","output","algorithm","input","flowchart","input","E");
        this.addQuestionCompFunda(q227);
        QuestionCompFunda q228= new QuestionCompFunda("Data coming from the computers is called","output","algorithm","input","flowchart","output","E");
        this.addQuestionCompFunda(q228);
        QuestionCompFunda q229= new QuestionCompFunda("Which of the following refers to a small, single-site network?","LAN","DSL","RAM","USB","LAN","E");
        this.addQuestionCompFunda(q229);
        QuestionCompFunda q230= new QuestionCompFunda("How many options does a binary choice offer?","Zero","One","Two","Three","Two","E");
        this.addQuestionCompFunda(q230);
        QuestionCompFunda q231= new QuestionCompFunda("A collection of program that controls how your computer system runs and processes information is called","operating system","computer","office","compiler","operating system","E");
        this.addQuestionCompFunda(q231);
        QuestionCompFunda q232= new QuestionCompFunda("Computer connected to a LAN (Local Area Network) can","run fast","be online","share peripherals","email","share peripheral","E");
        this.addQuestionCompFunda(q232);
        QuestionCompFunda q233= new QuestionCompFunda("Information travels between components on the mother board through","Flash memory","CMOS","Buses","Peripherals","Buses","E");
        this.addQuestionCompFunda(q233);
        QuestionCompFunda q234= new QuestionCompFunda("How are data organized in a spreadsheet?","Lines and spaces","Layers","Height and Width","Rows and Columns","Rows and Columns","E");
        this.addQuestionCompFunda(q234);
        QuestionCompFunda q235= new QuestionCompFunda("The blinking symbol on the computer screen is called the","mouse","hand","cursor","palm","cursor","E");
        this.addQuestionCompFunda(q235);
        QuestionCompFunda q236= new QuestionCompFunda("A fault in a computer program which prevents it from working correctly is known as","Boot","Bug","Bit","Binary","Bug","E");
        this.addQuestionCompFunda(q236);
        QuestionCompFunda q237= new QuestionCompFunda("How many options does a octal system offer?","Eight","Four","Two","Three","Eight","E");
        this.addQuestionCompFunda(q237);
        QuestionCompFunda q238= new QuestionCompFunda("How many options does a hexadecimal system offer?","Eight","Six","Sixteen","Three","Sixteen","E");
        this.addQuestionCompFunda(q238);
        QuestionCompFunda q239=new QuestionCompFunda("Father of C programming language","Dennis Ritchie","John Kennedy","Bill Gates","James Gosling","Dennis Ritchie","E");
        this.addQuestionCompFunda(q239);
        QuestionCompFunda q240=new QuestionCompFunda("Father of Java programming language","Dennis Ritchie","John Kennedy","Bill Gates","James Gosling","James Gosling","E");
        this.addQuestionCompFunda(q240);
        QuestionCompFunda q241= new QuestionCompFunda("BIOS stands for","Basic Input Output system","Binary Input output system","Basic Input Off system","All of the above","Basic Input Output system","E");
        this.addQuestionCompFunda(q241);
        QuestionCompFunda q242= new QuestionCompFunda("VDU is also called","Screen","Monitor","Both 1 & 2","Printer","Both 1 & 2","E");
        this.addQuestionCompFunda(q242);
        QuestionCompFunda q243= new QuestionCompFunda("The device used to carry digital data on analog lines is called as","Modem","Multiplexer","DeMultiplexer","Modulator","Modem","E");
        this.addQuestionCompFunda(q243);
        QuestionCompFunda q244= new QuestionCompFunda("SMPS stands for","Switched mode Power Supply","Start mode power supply","Store mode power supply","Single mode power supply","Switched mode Power Supply","E");
        this.addQuestionCompFunda(q244);
        QuestionCompFunda q245= new QuestionCompFunda("1 Byte = ?","8 bits","4 bits","2 bits","1 bit","8 bits","E");
        this.addQuestionCompFunda(q245);
        QuestionCompFunda q246= new QuestionCompFunda("Which of the following is an OOP Principle","Structured Programming","Procedural Programming","Inheritance","Linking","Inheritance","E");
        this.addQuestionCompFunda(q246);
        QuestionCompFunda q247= new QuestionCompFunda("Which command divides the surface of the blank disk into sectors and assign a unique address to each one","Ver","Format","Fat","Check Disk","Format","E");
        this.addQuestionCompFunda(q247);
        QuestionCompFunda q248= new QuestionCompFunda("Every computer connected to an intranet or extranet must have a distinct","firewall","Proxy Server","Domain Name","IP address","IP address","E");
        this.addQuestionCompFunda(q248);
        QuestionCompFunda q249= new QuestionCompFunda("Firewalls are used to protect against","Unauthorized Attacks","Viruses","Fire Attacks","Data Driven Attacks","Unauthorized Attacks","E");
        this.addQuestionCompFunda(q249);
        QuestionCompFunda q250= new QuestionCompFunda("The first Digital Computer introduced, was named as ","UNIVAC","EDSAC","ENIAC","MARK-1","MARK-1","E");
        this.addQuestionCompFunda(q250);

    }

    public void addQuestionCompFunda(QuestionCompFunda quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION1());
        values.put(KEY_ANSWER, quest.getANSWER1());
        values.put(KEY_OPTA, quest.getOPTA1());
        values.put(KEY_OPTB, quest.getOPTB1());
        values.put(KEY_OPTC, quest.getOPTC1());
        values.put(KEY_OPTD, quest.getOPTD1());
        values.put(KEY_CAT,quest.getCATEGORY1());
        // Inserting Row
        dbase.insert(TABLE_QUEST1, null, values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public List<QuestionCompFunda> getAllQuestions1(String tname, String lname)
    {
        List<QuestionCompFunda> quesList1= new ArrayList<QuestionCompFunda>();
        String selectQuery1 = "SELECT  * FROM " + tname+" WHERE "+KEY_CAT+" = '"+lname+"'";
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery1, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                QuestionCompFunda quest1 = new QuestionCompFunda();
                quest1.setID1(cursor.getInt(0));
                quest1.setQUESTION1(cursor.getString(1));
                quest1.setANSWER1(cursor.getString(2));
                quest1.setOPTA1(cursor.getString(3));
                quest1.setOPTB1(cursor.getString(4));
                quest1.setOPTC1(cursor.getString(5));
                quest1.setOPTD1(cursor.getString(6));
                quesList1.add(quest1);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList1;
    }

    public boolean insertScoreCompFunda(int scoreCompFunda,String tname, String cname) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(SCORE_KEY_SECTION.toString(),tname);
        contentValues.put(SCORE_KEY_CAT.toString(),cname);
        contentValues.put(SCORE_KEY_SCORE.toString(), scoreCompFunda);
        long resultscore = db.insert(TABLE_SCORE, null, contentValues);
        if(resultscore == -1)
            return false;
        else
            return true;
    }

    public boolean insertScoreFinal(int scoreRandom, String tname){
        SQLiteDatabase db = this.getWritableDatabase();
        String cname=null;
        ContentValues contentValues = new ContentValues();
        contentValues.put(SCORE_KEY_SECTION.toString(),tname);
        contentValues.put(SCORE_KEY_CAT.toString(),cname);
        contentValues.put(SCORE_KEY_SCORE.toString(), scoreRandom);
        long resultscore = db.insert(TABLE_SCORE, null, contentValues);
        if(resultscore == -1)
            return false;
        else
            return true;
    }

    public int getScoreCompFundaB() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM " + TABLE_SCORE + " WHERE "+ SCORE_KEY_SECTION + " = '"+ TABLE_QUEST1 +"' AND "+ SCORE_KEY_CAT + " = " +"'B'";
        c=db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x=c.getInt(0);
        return x;
    }

    public int getScoreCompFundaI() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM " + TABLE_SCORE + " WHERE "+ SCORE_KEY_SECTION + " = '"+ TABLE_QUEST1 +"' AND "+ SCORE_KEY_CAT + " = " +"'I'";
        c=db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x=c.getInt(0);
        return x;
    }

    public int getScoreCompFundaE() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM " + TABLE_SCORE + " WHERE "+ SCORE_KEY_SECTION + " = '"+ TABLE_QUEST1 +"' AND "+ SCORE_KEY_CAT + " = " +"'E'";
        c=db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x=c.getInt(0);
        return x;
    }


}
