package com.example.tablayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class tab3 extends AppCompatActivity {
    public String[] fakguru={"Program Studi Bahasa dan Sastra Indonesia",
            "Program Studi Pendidikan Biologi",
            "Program Studi Pendidikan Ekonomi",
            "Program Studi Pendidikan Bahasa Inggris",
            "Program Studi Pendidikan Guru Sekolah Dasar",
            "Program Studi Pendidikan Matematika"};
    public String[] fakbisnis={"Program Studi Manajemen",
            "Program Studi Akuntansi",
            "Program Studi Bisnis Digital"};

    public String[] fakhutan={"Program Studi Kehutanan",
            "Program Studi Ilmu Lingkungan"};

    public String[] fakkomputer={"Program Studi Sistem Informasi S1",
            "Program Studi Teknik Informatika S1",
            "Program Studi Desain Komunikasi Visual S1",
            "Program Studi Manajemen Informatika D3"};

    public String[] fakhukum={"Program Studi Ilmu Hukum S1"};
    EditText Guru;
    EditText Bisnis;
    EditText Hutan;
    EditText Komputer;
    EditText Hukum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);
    }

    public void keguruan(View v){
        Guru=(EditText) findViewById(R.id.dataprodiguru);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Program Studi Fakultas Keguruan dan Ilmu Pendidikan ");
        builder.setItems(fakguru, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int item) {
                Guru.setText(fakguru[item]);
                dialogInterface.dismiss();
            }
        }).show();
    }

    public void bisnis(View v){
        Bisnis=(EditText) findViewById(R.id.dataprodibisnis);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Program Studi Fakultas Ekonomi dan Bisnis ");
        builder.setItems(fakbisnis, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int item) {
                Bisnis.setText(fakbisnis[item]);
                dialogInterface.dismiss();
            }
        }).show();
    }

    public void hutan(View v){
        Hutan=(EditText) findViewById(R.id.dataprodikehutanan);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Program Studi Fakultas Kehutanan dan Lingkungan ");
        builder.setItems(fakhutan, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int item) {
                Hutan.setText(fakhutan[item]);
                dialogInterface.dismiss();
            }
        }).show();
    }

    public void komputer(View v){
        Komputer=(EditText) findViewById(R.id.dataprodikomputer);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Program Studi Fakultas Ilmu Komputer");
        builder.setItems(fakkomputer, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int item) {
                Komputer.setText(fakkomputer[item]);
                dialogInterface.dismiss();
            }
        }).show();
    }

    public void hukum(View v){
        Hukum=(EditText) findViewById(R.id.dataprodihukum);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Program Studi Fakultas Hukum");
        builder.setItems(fakhukum, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int item) {
                Hukum.setText(fakhukum[item]);
                dialogInterface.dismiss();
            }
        }).show();
    }
}
