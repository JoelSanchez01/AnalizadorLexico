/* Sección de declaraciones de JFlex */
%%
%public
%class AnalizadorLexico
%{

 /* Código personalizado */

 // Se agregó una propiedad para verificar si existen tokens pendientes
 private boolean _existenTokens = false;

 public boolean existenTokens(){
 return this._existenTokens;
 }

%}

 /* Al utilizar esta instrucción, se le indica a JFlex que devuelva objetos del tipo TokenPersonalizado */
%type TokenPersonalizado

%init{
 /* Código que se ejecutará en el constructor de la clase */
%init}

%eof{

 /* Código a ejecutar al finalizar el análisis, en este caso cambiaremos el valor de una variable bandera */
 this._existenTokens = false;

%eof}

/* Inicio de Expresiones regulares */

 Digito = [0-9]
 Numero = {Digito} {Digito}*
 Letra = [A-Za-z]
 Palabra = {Letra} {Letra}*
 Espacio = " "
SaltoDeLinea = \n|\r|\r\n
 Ciclo = for|while
 OpMatemat = [\/*]|[-+]+
 Comparacion = (==|\!|[=][><]|[><][=]?)
 Condicional = (if|switch|(\(.\)\?.\:.))
 asignacion = =
 tipoDato = (int|char|double)
 ArregloString = (String|char\[\])
 parentesis = [()]
 llaves = [{}]
 corchetes = [\[\]]
 importado = import
 instancia = new
 publico = public
 funcion = \.[\w]+
 pc = \;
 clase = class
 comillas = [\"\"]
 dospuntos = \:
 sobrescritura = @Override
 comentario = \/\/
 importarT = \.\*
 coma = \,
 guionB = \_
 variablePrivada = private
 comparador = &&

/* Finaliza expresiones regulares */

%%

// PALABRAS RESERVADAS, IUNDETIFICADORES, PUNTO SOLO, COMILLAS, CODIGO SOLO Y ARCHIVO

/* Finaliza la sección de declaraciones de JFlex */

/* Inicia sección de reglas */

// Cada regla está formada por una {expresión} espacio {código}

{comparador} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "comparador");
 this._existenTokens = true;
 return t;
}

{variablePrivada} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "Variable Privada");
 this._existenTokens = true;
 return t;
}

{guionB} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "Guion Bajo");
 this._existenTokens = true;
 return t;
}

{coma} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "Coma");
 this._existenTokens = true;
 return t;
}

{importarT} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "importa TODA LA LIBRERIA");
 this._existenTokens = true;
 return t;
}

{comentario} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "Comentario");
 this._existenTokens = true;
 return t;
}

{sobrescritura} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "Override");
 this._existenTokens = true;
 return t;
}

{dospuntos} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "Dos Puntos");
 this._existenTokens = true;
 return t;
}

{comillas} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "Comillas");
 this._existenTokens = true;
 return t;
}


{clase} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "Clase Nueva");
 this._existenTokens = true;
 return t;
}

{pc} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "Punto y coma");
 this._existenTokens = true;
 return t;
}

{funcion} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "se accede a la funcion de una clase");
 this._existenTokens = true;
 return t;
}

{publico} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "variable o funcion publica");
 this._existenTokens = true;
 return t;
}

{instancia} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "Se crea una nueva instancia");
 this._existenTokens = true;
 return t;
}

{importado} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "Libreria importada");
 this._existenTokens = true;
 return t;
}

{corchetes} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "INICIO o FIN de corchetes");
 this._existenTokens = true;
 return t;
}

{llaves} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "INICIO o FIN de llaves");
 this._existenTokens = true;
 return t;
}

{parentesis} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "INICIO o FIN de parentesis");
 this._existenTokens = true;
 return t;
}

{ArregloString} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "ARREGLO DE STRING");
 this._existenTokens = true;
 return t;
}

{tipoDato} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "DATO PRIMITIVO");
 this._existenTokens = true;
 return t;
}

{asignacion} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "ASIGNACION");
 this._existenTokens = true;
 return t;
}

{Condicional} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "CONDICIONAL");
 this._existenTokens = true;
 return t;
}

{Comparacion} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "COMPARACION");
 this._existenTokens = true;
 return t;
}

{OpMatemat} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "OPERADOR MATEMATICO");
 this._existenTokens = true;
 return t;
}

{Numero} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "NUMERO");
 this._existenTokens = true;
 return t;
}

{Ciclo} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "CICLO");
 this._existenTokens = true;
 return t;
}

{Palabra} {
 TokenPersonalizado t = new TokenPersonalizado(yytext(), "PALABRA");
 this._existenTokens = true;
 return t;
}

{Espacio} {
 // Ignorar cuando se ingrese un espacio
}

{SaltoDeLinea} {
 //IGNORAR
}