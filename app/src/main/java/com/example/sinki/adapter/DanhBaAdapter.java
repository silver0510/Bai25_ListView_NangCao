package com.example.sinki.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sinki.bai25_listview_nangcao.R;
import com.example.sinki.model.DanhBa;

import java.util.List;

/**
 * Created by Sinki on 8/20/2017.
 */

public class DanhBaAdapter extends ArrayAdapter<DanhBa> {
    Activity context;//màn hình sử dụng layout này
    int resource;//layout cho từng dòng hiển thị
    List<DanhBa> objects;//danh sách nguồn dữ liệu muốn hiển thị

    public DanhBaAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<DanhBa> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflat = this.context.getLayoutInflater();
        View row = inflat.inflate(this.resource,null);

        TextView txtTen = (TextView)row.findViewById(R.id.txtTen);
        TextView txtPhone = (TextView)row.findViewById(R.id.txtPhone);
        ImageButton btnCall = (ImageButton) row.findViewById(R.id.btnCall);
        ImageButton btnSMS = (ImageButton) row.findViewById(R.id.btnSMS);
        ImageButton btnNotification = (ImageButton) row.findViewById(R.id.btnNotification);

        //trả về danh bạ hiện tại muốn vẽ
        final DanhBa danhBa = this.objects.get(position);
        txtTen.setText(danhBa.getTen());
        txtPhone.setText(danhBa.getPhone());

        btnNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyXemChiTiet(danhBa);
            }
        });

        return row;
    }

    private void xuLyXemChiTiet(DanhBa danhBa) {
        Toast.makeText(this.context,"Bạn chọn :"+ danhBa.getTen(),Toast.LENGTH_SHORT).show();
    }
}
