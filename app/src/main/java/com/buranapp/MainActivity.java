package com.buranapp;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_recommend,btn_stockmarket,btn_yen_coin,btn_help;
    private LinearLayout home,market,deal,consult,account;
    private ImageView iv_home,iv_market,iv_deal,iv_consult,iv_account;
    private TextView tv_home,tv_market,tv_deal,tv_consult,tv_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        initView();
    }
    public void initView(){
        //好币推荐
        btn_recommend= (Button) findViewById(R.id.btn_recommend);
        Drawable drawable=getResources().getDrawable(R.drawable.recommend);
        drawable.setBounds(20,0,120,100);//第一0是距左边距离，第二0是距上边距离，40分别是长宽
        btn_recommend.setCompoundDrawables(drawable,null,null,null);//只放左边
        //新币申购
        btn_stockmarket= (Button) findViewById(R.id.btn_stockmarket);
        Drawable drawable2=getResources().getDrawable(R.drawable.stockmarket);
        drawable2.setBounds(20,0,120,100);//第一0是距左边距离，第二0是距上边距离，40分别是长宽
        btn_stockmarket.setCompoundDrawables(drawable2, null, null, null);//只放左边
        //充值币
        btn_yen_coin= (Button) findViewById(R.id.btn_yen_coin);
        Drawable drawable3=getResources().getDrawable(R.drawable.yen_coin);
        drawable3.setBounds(20,0,120,100);//第一0是距左边距离，第二0是距上边距离，40分别是长宽
        btn_yen_coin.setCompoundDrawables(drawable3, null, null, null);//只放左边
        //帮助中心
        btn_help= (Button) findViewById(R.id.btn_help);
        Drawable drawable4=getResources().getDrawable(R.drawable.help);
        drawable4.setBounds(20, 0, 120, 100);//第一0是距左边距离，第二0是距上边距离，40分别是长宽
        btn_help.setCompoundDrawables(drawable4, null, null, null);//只放左边

        iv_home= (ImageView) findViewById(R.id.iv_home);
        iv_market= (ImageView) findViewById(R.id.iv_market);
        iv_deal= (ImageView) findViewById(R.id.iv_deal);
        iv_consult= (ImageView) findViewById(R.id.iv_consult);
        iv_account= (ImageView) findViewById(R.id.iv_account);
        //
        tv_home= (TextView) findViewById(R.id.tv_home);
        tv_market= (TextView) findViewById(R.id.tv_market);
        tv_deal= (TextView) findViewById(R.id.tv_deal);
        tv_consult= (TextView) findViewById(R.id.tv_consult);
        tv_account= (TextView) findViewById(R.id.tv_account);
        //首页
        home= (LinearLayout) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_home.setImageResource(R.drawable.home1);
                iv_market.setImageResource(R.drawable.market);
                iv_deal.setImageResource(R.drawable.deal);
                iv_consult.setImageResource(R.drawable.consult);
                iv_account.setImageResource(R.drawable.account);
                //改变字体颜色
                tv_home.setTextColor(MainActivity.this.getResources().getColor(R.color.activity_main_text_bgcolor));
                tv_market.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_deal.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_consult.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_account.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
            }
        });
        //行情
        market= (LinearLayout) findViewById(R.id.market);
        market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_home.setImageResource(R.drawable.home);
                iv_market.setImageResource(R.drawable.market2);
                iv_deal.setImageResource(R.drawable.deal);
                iv_consult.setImageResource(R.drawable.consult);
                iv_account.setImageResource(R.drawable.account);
                //改变字体颜色
                tv_home.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_market.setTextColor(MainActivity.this.getResources().getColor(R.color.activity_main_text_bgcolor));
                tv_deal.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_consult.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_account.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
            }
        });
        //交易
        deal= (LinearLayout) findViewById(R.id.deal);
        deal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_home.setImageResource(R.drawable.home);
                iv_market.setImageResource(R.drawable.market);
                iv_deal.setImageResource(R.drawable.deal3);
                iv_consult.setImageResource(R.drawable.consult);
                iv_account.setImageResource(R.drawable.account);
                //改变字体颜色
                tv_home.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_market.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_deal.setTextColor(MainActivity.this.getResources().getColor(R.color.activity_main_text_bgcolor));
                tv_consult.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_account.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
            }
        });
        //咨询
        consult= (LinearLayout) findViewById(R.id.consult);
        consult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_home.setImageResource(R.drawable.home);
                iv_market.setImageResource(R.drawable.market);
                iv_deal.setImageResource(R.drawable.deal);
                iv_consult.setImageResource(R.drawable.consult4);
                iv_account.setImageResource(R.drawable.account);
                //改变字体颜色
                tv_home.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_market.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_deal.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_consult.setTextColor(MainActivity.this.getResources().getColor(R.color.activity_main_text_bgcolor));
                tv_account.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
            }
        });
        //账户
        account= (LinearLayout) findViewById(R.id.account);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_home.setImageResource(R.drawable.home);
                iv_market.setImageResource(R.drawable.market);
                iv_deal.setImageResource(R.drawable.deal);
                iv_consult.setImageResource(R.drawable.consult);
                iv_account.setImageResource(R.drawable.account5);
                //改变字体颜色
                tv_home.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_market.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_deal.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_consult.setTextColor(MainActivity.this.getResources().getColor(R.color.colorBlack));
                tv_account.setTextColor(MainActivity.this.getResources().getColor(R.color.activity_main_text_bgcolor));
            }
        });
    }
}
