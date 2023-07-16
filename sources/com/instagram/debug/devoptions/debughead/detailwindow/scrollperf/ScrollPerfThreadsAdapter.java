package com.instagram.debug.devoptions.debughead.detailwindow.scrollperf;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C18190wL;
import X.C41030Luu;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import java.util.List;

public class ScrollPerfThreadsAdapter extends C41030Luu {
    public final Context mContext;
    public List mData;

    public void onBindViewHolder(ScrollPerfThreadsViewHolder scrollPerfThreadsViewHolder, int i) {
        scrollPerfThreadsViewHolder.mThread.setText(C18190wL.A0p(this.mData, i));
    }

    public ScrollPerfThreadsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ScrollPerfThreadsViewHolder(AnonymousClass0wJ.A0H(LayoutInflater.from(this.mContext), viewGroup, R.layout.row_scroll_perf_thread), this.mContext);
    }

    public void replaceItems(List list) {
        this.mData.clear();
        this.mData.addAll(list);
        notifyDataSetChanged();
    }

    public ScrollPerfThreadsAdapter(Context context, List list) {
        this.mContext = context;
        this.mData = list;
    }

    public int getItemCount() {
        int A03 = C14030oh.A03(484709865);
        int size = this.mData.size();
        C14030oh.A0A(538116268, A03);
        return size;
    }
}
