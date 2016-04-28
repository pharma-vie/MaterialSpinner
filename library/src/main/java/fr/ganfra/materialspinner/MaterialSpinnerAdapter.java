package fr.ganfra.materialspinner;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * @author YanLu
 * @since 16/4/27
 */
public class MaterialSpinnerAdapter<T> extends ArrayAdapter<T> {

    /**
     * The resource indicating what views to inflate to display the content of this
     * array adapter.
     */
    private int mLayoutResource;

    /**
     * The resource indicating what views to inflate to display the content of this
     * array adapter in a drop down widget.
     */
    private int mDropDownLayoutResource;

    public MaterialSpinnerAdapter(Context context, int resource) {
        super(context, resource);
        this.mLayoutResource = resource;
    }

    public MaterialSpinnerAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
        this.mLayoutResource = resource;
    }

    public MaterialSpinnerAdapter(Context context, int resource, T[] objects) {
        super(context, resource, objects);
        this.mLayoutResource = resource;
    }

    public MaterialSpinnerAdapter(Context context, int resource, int textViewResourceId, T[] objects) {
        super(context, resource, textViewResourceId, objects);
        this.mLayoutResource = resource;
    }

    public MaterialSpinnerAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.mLayoutResource = resource;
    }

    public MaterialSpinnerAdapter(Context context, int resource, int textViewResourceId, List<T> objects) {
        super(context, resource, textViewResourceId, objects);
        this.mLayoutResource = resource;
    }


    /**
     * <p>Sets the layout resource to create the drop down views.</p>
     *
     * @param resource the layout resource defining the drop down views
     * @see #getDropDownView(int, android.view.View, android.view.ViewGroup)
     */
    @Override
    public void setDropDownViewResource(@LayoutRes int resource) {
        super.setDropDownViewResource(resource);
        this.mDropDownLayoutResource = resource;
    }

    public int getResource() {
        return mLayoutResource;
    }


    public int getDropDownResource() {
        return mDropDownLayoutResource;
    }


}
