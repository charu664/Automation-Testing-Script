package TestRestAssured;

public class Token {
    public String assignToken(String moduleType,String tkn) {

        String token=null;

        if (moduleType.equalsIgnoreCase("login")) {

            token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJDaGFydSIsImlkIjo4LCJleHAiOjE3MjIyOTE0MjYsImlhdCI6MTcyMjI1NTQyNn0.svbWhiwBU99OGi1YhPKwVhIMXQ17Bso1vy6gKxeOERs";
        }


        return token;
    }
}
