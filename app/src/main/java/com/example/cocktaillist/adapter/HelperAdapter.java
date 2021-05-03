package com.example.cocktaillist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cocktaillist.R;
import com.example.cocktaillist.ui.main.specific.SpecificFragment;

import java.util.ArrayList;

public class HelperAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList arrayList, arrayListName, arrayListIngredients;

    public HelperAdapter(Context context, ArrayList arrayList, ArrayList arrayListName, ArrayList arrayListIngredients) {
        this.context = context;
        this.arrayList = arrayList;
        this.arrayListName = arrayListName;
        this.arrayListIngredients = arrayListIngredients;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolderClass viewHolderClass = new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolderClass viewHolderClass = (ViewHolderClass)holder;
        viewHolderClass.imageView.setImageResource((Integer) arrayList.get(position));
        viewHolderClass.textView.setText(arrayListName.get(position).toString());
        viewHolderClass.textView2.setText(arrayListIngredients.get(position).toString());
        viewHolderClass.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, viewHolderClass.textView.getText(), Toast.LENGTH_SHORT).show();

                SpecificFragment specificFragment = new SpecificFragment();
                FragmentManager manager = ((AppCompatActivity)context).getSupportFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment, specificFragment, specificFragment.getTag()).commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListName.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        TextView textView2;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.list_imageView);
            textView = (TextView)itemView.findViewById(R.id.cocktail_name);
            textView2 = (TextView)itemView.findViewById(R.id.ingredients);
        }
    }
}
