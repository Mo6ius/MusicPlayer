package com.example.android.musicplayer;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PieceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Piece} objects.
 */
public class PieceAdapter extends ArrayAdapter<Piece> {

    /**
     * Resource ID for the background color for this list of pieces
     */
    private int mColorResourceId;

    /**
     * Create a new {@link PieceAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param pieces          is the list of {@link Piece}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of pieces
     */
    public PieceAdapter(Context context, ArrayList<Piece> pieces, int colorResourceId) {
        super(context, 0, pieces);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Piece} object located at this position in the list
        Piece currentPiece = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID piece_text_view.
        TextView pieceTextView = (TextView) listItemView.findViewById(R.id.piece_text_view);
        // Get the music piece from the currentPiece object and set this text on
        // the piece TextView.
        pieceTextView.setText(currentPiece.getmComposition());

        // Find the TextView in the list_item.xml layout with the ID composer_text_view.
        TextView composerTextView = (TextView) listItemView.findViewById(R.id.composer_text_view);
        // Get the composer from the currentPiece object and set this text on
        // the composer TextView.
        composerTextView.setText(currentPiece.getmComposer());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Set the ImageView to the image resource specified in the current Piece
        imageView.setImageResource(currentPiece.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}