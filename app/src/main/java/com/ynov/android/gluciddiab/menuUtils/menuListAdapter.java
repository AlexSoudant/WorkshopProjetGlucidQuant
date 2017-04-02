package com.ynov.android.gluciddiab.menuUtils;

/**
 * Created by admin on 02/04/17.
 */

public class menuListAdapter {//extends ArrayAdapter<Item> {

/*
    public menuListAdapter(Context context, ArrayList<String> items) {
        super(context, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_panier,parent, false);
        }

        TweetViewHolder viewHolder = (TweetViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new TweetViewHolder();
            viewHolder.btnDelete = (Button) convertView.findViewById(R.id.panierButtonDelete);
            viewHolder.nomItem = (TextView) convertView.findViewById(R.id.panierNomItem);
            //viewHolder.imageItem = (ImageView) convertView.findViewById(R.id.panierImageItem);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Item item = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.btnDelete.setText("supprimer");
        viewHolder.nomItem.setText(item.getText());
        //viewHolder.imageItem;

        return convertView;
    }

    private class TweetViewHolder{
        public Button btnDelete;
        public TextView nomItem;
        public ImageView imageItem;
    }*/
}
