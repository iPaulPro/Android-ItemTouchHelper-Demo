package co.paulburke.android.itemtouchhelperdemo;

import android.content.Context;

import co.paulburke.android.itemtouchhelperdemo.helper.OnStartDragListener;

/**
 * Date: 2016-03-17
 * Time: 21:08
 * Author: cf
 * -----------------------------
 */
public class RecyclerGridAdapter extends RecyclerListAdapter {

    public RecyclerGridAdapter(Context context, OnStartDragListener dragStartListener) {
        super(context, dragStartListener);
    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        String str = mItems.get(fromPosition);
        mItems.remove(fromPosition);
        mItems.add(toPosition, str);

        notifyItemMoved(fromPosition, toPosition);
        return true;
    }
}
