package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.IDxAdapterShape3S0300000_1_I2;
import androidx.recyclerview.widget.IDxIDecorationShape55S0100000_1_I2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;
import java.util.Random;

/* renamed from: X.3GA  reason: invalid class name */
public final class AnonymousClass3GA {
    public View A00;
    public RecyclerView A01;
    public Random A02 = new Random();
    public final ImageView A03;
    public final RegFlowExtras A04;
    public final C07530bf A05;
    public final SearchEditText A06;
    public final C313625r A07;
    public final AnonymousClass265 A08;

    public final void A00(Context context, List list) {
        if (list != null && !list.isEmpty()) {
            ImageView imageView = this.A03;
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.refresh);
            C63163fI.A02(imageView, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_normal_text_color);
            AnonymousClass0wJ.A18(imageView, 154, list, this);
            imageView.setContentDescription(imageView.getResources().getString(2131836357));
            this.A00.setVisibility(0);
            RecyclerView recyclerView = this.A01;
            recyclerView.setAdapter(new IDxAdapterShape3S0300000_1_I2(0, context, this, list));
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        }
    }

    public AnonymousClass3GA(View view, ImageView imageView, RegFlowExtras regFlowExtras, C07530bf r7, SearchEditText searchEditText, C313625r r9, AnonymousClass265 r10) {
        this.A00 = view.findViewById(R.id.username_suggestions_container);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.username_suggestions);
        this.A01 = recyclerView;
        this.A06 = searchEditText;
        this.A03 = imageView;
        this.A05 = r7;
        this.A07 = r9;
        this.A04 = regFlowExtras;
        this.A08 = r10;
        recyclerView.A0y(new IDxIDecorationShape55S0100000_1_I2(this, 2));
    }
}
