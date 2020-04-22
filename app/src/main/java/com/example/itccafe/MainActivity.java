package com.example.itccafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button btnKurang1,btnKurang2,btnKurang3,btnTambah1,btnTambah2,btnTambah3,btnBuy,btnReset;
    TextView tvSatu,tvDua,tvTiga,tvPrice,tvPurchased;

    int jumlahA =0;
    int jumlahD = 0;
    int jumlahE = 0;
    int totalHarga =0;

    final int hargaA = 30000;
    final int hargaD = 45000;
    final int hargaE = 12000;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKurang1=findViewById(R.id.btn_kurang);
        btnKurang2=findViewById(R.id.btn_kurang2);
        btnKurang3=findViewById(R.id.btn_kurang3);
        btnTambah1=findViewById(R.id.btn_tambah);
        btnTambah2=findViewById(R.id.btn_tambah2);
        btnTambah3=findViewById(R.id.btn_tambah3);

        btnBuy=findViewById(R.id.btn_buy);
        btnReset = findViewById(R.id.btn_reset);

        tvSatu = findViewById(R.id.tv_jumlah_a);
        tvDua = findViewById(R.id.tv_jumlah_d);
        tvTiga = findViewById(R.id.tv_jumlah_e);
        tvPrice = findViewById(R.id.tv_price);
        tvPurchased = findViewById(R.id.tv_status);

         btnKurang1.setOnClickListener(this);
         btnKurang2.setOnClickListener(this);
         btnKurang3.setOnClickListener(this);
         btnTambah1.setOnClickListener(this);
         btnTambah2.setOnClickListener(this);
         btnTambah3.setOnClickListener(this);
         btnBuy.setOnClickListener(this);
         btnReset.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_tambah :
                tambahPesanan(R.id.btn_tambah);
                break;
            case  R.id.btn_tambah2 :
                tambahPesanan(R.id.btn_tambah2);
                break;
            case  R.id.btn_tambah3 :
                tambahPesanan(R.id.btn_tambah3);
                break;
            case  R.id.btn_kurang :
                kurangPesanan(R.id.btn_kurang);
                break;
            case R.id.btn_kurang2:
                kurangPesanan(R.id.btn_kurang2);
             break;
            case R.id.btn_kurang3 :
                kurangPesanan(R.id.btn_kurang3);
                break;
            case R.id.btn_buy :
                tvPurchased.setText("Purchased");
                break;
            case R.id.btn_reset :
                reset();
                break;
        }
    }
    void tambahPesanan (int menu){
        if (menu==R.id.btn_tambah ){
            if(jumlahA<10) {
                jumlahA++;
                totalHarga=totalHarga+hargaA;

                tvSatu.setText(""+jumlahA);
                tvPrice.setText("Rp. "+totalHarga);
            }

            }
        if (menu==R.id.btn_tambah2 ){
            if(jumlahD<10) {
                jumlahD++;
                totalHarga=totalHarga+hargaD;

                tvDua.setText(""+jumlahD);
                tvPrice.setText("Rp. "+totalHarga);
            }

        }
        if (menu==R.id.btn_tambah3 ){
            if(jumlahE<10) {
                jumlahE++;
                totalHarga=totalHarga+hargaE;

                tvTiga.setText(""+jumlahE);
                tvPrice.setText("Rp. "+totalHarga);
            }

        }
        }

        void kurangPesanan(int menu){
        if (menu==R.id.btn_kurang){
            if(jumlahA>0) {
                jumlahA--;
                totalHarga=totalHarga-hargaA;

                tvSatu.setText(""+jumlahA);
                tvPrice.setText("Rp. "+totalHarga);
            }

        }
            if (menu==R.id.btn_kurang2){
                if(jumlahD>0) {
                    jumlahD--;
                    totalHarga=totalHarga-hargaD;

                    tvDua.setText(""+jumlahD);
                    tvPrice.setText("Rp. "+totalHarga);
                }

            }
            if (menu==R.id.btn_kurang3){
                if(jumlahE>0) {
                    jumlahE--;
                    totalHarga=totalHarga-hargaE;

                    tvTiga.setText(""+jumlahE);
                    tvPrice.setText("Rp. "+totalHarga);
                }

            }


            }

            void reset (){
                jumlahA=0;
                jumlahD=0;
                jumlahE=0;
                totalHarga=0;
                tvPrice.setText("Rp. 0");
                tvPurchased.setText("-");
            }

    }

