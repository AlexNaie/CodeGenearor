package com.tropical.codegeneratorapp.model;

import javax.persistence.*;

@Entity
public class Code {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String code;
    private boolean winning;
    private boolean used;

    public Code() {}

    public Code(String code, boolean winning, boolean used) {
        this.code = code;
        this.winning = winning;
        this.used = used;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isWinning() {
        return winning;
    }

    public void setWinning(boolean winning) {
        this.winning = winning;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return "Code{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", winning=" + winning +
                ", used=" + used +
                '}';
    }

    public static Code generateOneCode(int codeLength, boolean winning) {
        String code = "";
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Code generatedCode;

        for(int j = 0; j < codeLength; j++) {
            code += String.valueOf(characters.charAt((int)(Math.random() * 100) % characters.length()));
        }
        generatedCode = new Code(code, winning, false);

        System.out.println(generatedCode);
        return generatedCode;
    }
}
