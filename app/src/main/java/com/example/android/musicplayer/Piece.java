package com.example.android.musicplayer;

/**
 * {@link Piece} represents a piece of music that the user wants to listen.
 * It contains a composition, the composer of that piece, and an image.
 */
public class Piece {

    /** Composition */
    private String mComposition;

    /** Composer of that piece */
    private String mComposer;

    /** Image resource ID for the piece */
    private int mImageResourceId;

    /** Audio resource ID for the piece */
    private int mAudioResourceId;

    /**
     * Create a new Piece object.
     *
     * @param composition is a piece of music.
     * @param composer is the composer of that piece.
     * @param imageResourceId is the drawable resource ID for the image associated with the piece
     * @param audioResourceId is the resource ID for the audio file associated with this piece
     */
    public Piece(String composition, String composer, int imageResourceId, int audioResourceId) {
        mComposition = composition;
        mComposer = composer;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the composition.
     */
    public String getmComposition() {
        return mComposition;
    }

    /**
     * Get the composer of that piece.
     */
    public String getmComposer() {
        return mComposer;
    }

    /**
     * Return the image resource ID of the piece.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return the audio resource ID of the piece.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}