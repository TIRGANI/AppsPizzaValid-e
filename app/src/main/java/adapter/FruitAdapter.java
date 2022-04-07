package adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appspizza.R;

import java.util.List;

import beans.Fruit;

public class FruitAdapter extends BaseAdapter {
    private List<Fruit> fruits;
    private LayoutInflater inflater;

    public FruitAdapter(List<Fruit> fruits, Activity activity) {
        this.fruits = fruits;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return fruits.size();
    }

    @Override
    public Object getItem(int position) {
        return fruits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position+1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.list_item, null);

        TextView idf = convertView.findViewById(R.id.idf);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView quantite = convertView.findViewById(R.id.quantite);
        TextView quan = convertView.findViewById(R.id.quan);
        ImageView photo = convertView.findViewById(R.id.photo);

        idf.setText(fruits.get(position).getId()+"");
        quan.setText(fruits.get(position).getDesc()+"");
        nom.setText(fruits.get(position).getNom());
        quantite.setText(fruits.get(position).getQuantite()+"");
        photo.setImageResource(fruits.get(position).getPhoto());




        return convertView;
    }
}
