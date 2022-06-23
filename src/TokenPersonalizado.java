public class TokenPersonalizado {

    String _token;
    String _lexema;

    public String getLexema(){
        return this._lexema;
    }

    public String getToken(){
        return this._token;
    }

    TokenPersonalizado (String lexema, String token){
        this._lexema = lexema;
        this._token = token;
    }

    public String toString(){
        return "Lexema: " + this._lexema + " Token: " + this._token + ";";
    }


}