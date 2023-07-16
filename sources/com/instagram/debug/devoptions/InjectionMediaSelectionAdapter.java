package com.instagram.debug.devoptions;

import X.AnonymousClass00J;
import X.AnonymousClass0wJ;
import X.AnonymousClass4O1;
import X.C001300p;
import X.C04220Ms;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C41030Luu;
import X.M5O;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.igds.components.switchbutton.IgSwitch;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class InjectionMediaSelectionAdapter extends C41030Luu {
    public final Delegate delegate;
    public final List mediaInjectionsList;
    public final Set savedMediaInjections;

    public interface Delegate {
        void onItemSelectionChanged(Set set);
    }

    public final class InjectionMediaViewHolder extends M5O {
        public View injectedMediaRow;
        public IgSwitch injectedMediaSwitch;
        public TextView injectedMediaText;
        public final /* synthetic */ InjectionMediaSelectionAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InjectionMediaViewHolder(InjectionMediaSelectionAdapter injectionMediaSelectionAdapter, View view) {
            super(view);
            C04220Ms.A0B(view, 2);
            this.this$0 = injectionMediaSelectionAdapter;
            this.injectedMediaSwitch = (IgSwitch) AnonymousClass0wJ.A0I(view, R.id.inject_media_toggle_switch);
            this.injectedMediaText = (TextView) AnonymousClass0wJ.A0I(view, R.id.inject_media_toggle_text);
            this.injectedMediaRow = view;
        }

        public final void setInjectedMediaRow(View view) {
            C04220Ms.A0B(view, 0);
            this.injectedMediaRow = view;
        }

        public final void setInjectedMediaSwitch(IgSwitch igSwitch) {
            C04220Ms.A0B(igSwitch, 0);
            this.injectedMediaSwitch = igSwitch;
        }

        public final void setInjectedMediaText(TextView textView) {
            C04220Ms.A0B(textView, 0);
            this.injectedMediaText = textView;
        }

        public final void bindView(int i) {
            AnonymousClass4O1 r3 = (AnonymousClass4O1) this.this$0.mediaInjectionsList.get(i);
            this.injectedMediaText.setText(r3.A03);
            this.injectedMediaSwitch.setOnCheckedChangeListener(new InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$1(this.this$0, r3));
            this.injectedMediaSwitch.setChecked(this.this$0.savedMediaInjections.contains(r3.A02));
            this.injectedMediaRow.setOnClickListener(new InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$2(this));
        }

        public final View getInjectedMediaRow() {
            return this.injectedMediaRow;
        }

        public final IgSwitch getInjectedMediaSwitch() {
            return this.injectedMediaSwitch;
        }

        public final TextView getInjectedMediaText() {
            return this.injectedMediaText;
        }
    }

    public void onBindViewHolder(InjectionMediaViewHolder injectionMediaViewHolder, int i) {
        C04220Ms.A0B(injectionMediaViewHolder, 0);
        injectionMediaViewHolder.bindView(i);
    }

    public InjectionMediaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        return new InjectionMediaViewHolder(this, C18200wM.A0F(C18180wK.A0C(viewGroup), viewGroup, R.layout.media_injection_toggle_row, false));
    }

    public final void updateList(List list) {
        C04220Ms.A0B(list, 0);
        List list2 = this.mediaInjectionsList;
        list2.clear();
        list2.addAll(list);
        C001300p.A0x(list2);
        notifyDataSetChanged();
    }

    public InjectionMediaSelectionAdapter(Delegate delegate2, List list, Set set) {
        AnonymousClass0wJ.A1O(delegate2, list);
        C04220Ms.A0B(set, 3);
        this.delegate = delegate2;
        ArrayList A0s = C18200wM.A0s(list);
        C001300p.A0x(A0s);
        this.mediaInjectionsList = A0s;
        this.savedMediaInjections = AnonymousClass00J.A0b(set);
    }

    public int getItemCount() {
        int A03 = C14030oh.A03(56674734);
        int size = this.mediaInjectionsList.size();
        C14030oh.A0A(1973278268, A03);
        return size;
    }

    public final void setMediaInjectionsList(List list, Set set) {
        AnonymousClass0wJ.A1N(list, set);
        List list2 = this.mediaInjectionsList;
        list2.clear();
        list2.addAll(list);
        C001300p.A0x(list2);
        Set set2 = this.savedMediaInjections;
        set2.clear();
        set2.addAll(set);
        notifyDataSetChanged();
    }
}
