package com.example.happycharlie;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos){
        BaseDeDatos.execSQL("create table mensajes(codigo int primary key, mensaje text)");

        //Mensajes de Anime insertados manualmente
        BaseDeDatos.execSQL("insert into mensajes(codigo, mensaje) values('0','Todo lo que necesitas para lograr tus objetivos ya está en ti.')");
        BaseDeDatos.execSQL("insert into mensajes(codigo, mensaje) values('1','No vas a dominar el resto de tu vida en un día. Relájate. Domina el día. Entonces sigue haciendo eso todos los días.')");
        BaseDeDatos.execSQL("insert into mensajes(codigo, mensaje) values('2','No importa lo lento que vayas, siempre y cuando no te detengas.')");
        BaseDeDatos.execSQL("insert into mensajes(codigo, mensaje) values('3','A veces, cuando estás en un lugar oscuro, crees que has sido enterrado, pero en realidad te han plantado.')");
        BaseDeDatos.execSQL("insert into mensajes(codigo, mensaje) values('4','Hay algo en ti que el mundo necesita.')");
        BaseDeDatos.execSQL("insert into mensajes(codigo, mensaje) values('5','He aquí un consejo que una vez oí dar a un joven: “Haz siempre lo que temas hacer”')");
        BaseDeDatos.execSQL("insert into mensajes(codigo, mensaje) values('6','A veces se necesita una ruptura abrumadora para tener un avance innegable.')");
        BaseDeDatos.execSQL("insert into mensajes(codigo, mensaje) values('7','Sé que ha sido duro, pero todavía te estoy animando.')");
        BaseDeDatos.execSQL("insert into mensajes(codigo, mensaje) values('8','Es muy sencillo, si pretendes volar tendrás que desprenderte de las cosas que te pesan.')");
        BaseDeDatos.execSQL("insert into mensajes(codigo, mensaje) values('9','Un poco de progreso todos los días se suma a los grandes resultados.')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}