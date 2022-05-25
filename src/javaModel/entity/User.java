package javaModel.entity;

public class User {
    private String job;
    String record;
    String isMain;
    private String email;
    private String name;
    private String nation;
    String birth;
    private String school;
    String webside;
    String isN;
    String isM;
    String file;
    String zhengming;
    String yanzheng;
    String zhushi;
    String ageless;
    String isAllow;
    String agree;
    int id;

    public User() {
    }

    public User(String job, String email, String name, String school, String nation) {
        this.job = job;
        this.email = email;
        this.name = name;
        this.school = school;
        this.nation = nation;
    }

    public User(String job, String record, String isMain, String email, String name, String nation, String birth, String school, String webside, String isN, String isM, String file, String zhengming, String yanzheng, String zhushi, String ageless, String isAllow, String agree) {
        this.job = job;
        this.record = record;
        this.isMain = isMain;
        this.email = email;
        this.name = name;
        this.nation = nation;
        this.birth = birth;
        this.school = school;
        this.webside = webside;
        this.isN = isN;
        this.isM = isM;
        this.file = file;
        this.zhengming = zhengming;
        this.yanzheng = yanzheng;
        this.zhushi = zhushi;
        this.ageless = ageless;
        this.isAllow = isAllow;
        this.agree = agree;
    }

    public String getJob() {
        return job;
    }

    public String getRecord() {
        return record;
    }

    public String getIsMain() {
        return isMain;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public String getBirth() {
        return birth;
    }

    public String getSchool() {
        return school;
    }

    public String getWebside() {
        return webside;
    }

    public String getIsN() {
        return isN;
    }

    public String getIsM() {
        return isM;
    }

    public String getFile() {
        return file;
    }

    public String getZhengming() {
        return zhengming;
    }

    public String getYanzheng() {
        return yanzheng;
    }

    public String getZhushi() {
        return zhushi;
    }

    public String getAgeless() {
        return ageless;
    }

    public String getIsAllow() {
        return isAllow;
    }

    public String getAgree() {
        return agree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


