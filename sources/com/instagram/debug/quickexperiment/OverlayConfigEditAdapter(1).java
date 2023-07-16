package com.instagram.debug.quickexperiment;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass1fz;
import X.AnonymousClass1g0;
import X.AnonymousClass36S;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.C23871fu;
import X.C24001gj;
import X.C24031gm;
import X.C27900EvB;
import X.C34727Idy;
import X.C57583Bq;
import X.C63273h9;
import X.C63613hu;
import X.C83124qp;
import X.L2E;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

public class OverlayConfigEditAdapter extends C34727Idy implements C27900EvB {
    public static final String TAG = "OverlayConfigEditAdapter";
    public final C24001gj mHeaderBinderGroup;
    public List mItems = AnonymousClass0wJ.A0v();
    public final AnonymousClass1fz mMenuItemBinderGroup;
    public final C23871fu mSeparatorBinderGroup;
    public final AnonymousClass36S mSimpleBadgeHeaderPaddingState;
    public final AnonymousClass1g0 mSwitchBinderGroup;
    public final C24031gm mTypeaheadHeaderBinderGroup;

    public OverlayConfigEditAdapter getAdapter() {
        return this;
    }

    public void setMenuItemList(List list) {
        this.mItems.clear();
        this.mItems.addAll(list);
        updateItems();
    }

    public OverlayConfigEditAdapter(Context context, C83124qp r7) {
        AnonymousClass1fz r4 = new AnonymousClass1fz(context);
        this.mMenuItemBinderGroup = r4;
        C24001gj r3 = new C24001gj(context);
        this.mHeaderBinderGroup = r3;
        this.mSimpleBadgeHeaderPaddingState = new AnonymousClass36S();
        C24031gm r2 = new C24031gm(r7);
        this.mTypeaheadHeaderBinderGroup = r2;
        AnonymousClass1g0 r1 = new AnonymousClass1g0(context);
        this.mSwitchBinderGroup = r1;
        C23871fu r0 = new C23871fu(context);
        this.mSeparatorBinderGroup = r0;
        init(r3, r4, r1, r2, r0);
        updateItems();
    }

    private void updateItems() {
        L2E l2e;
        Object r1;
        L2E l2e2;
        clear();
        addModel((Object) null, this.mTypeaheadHeaderBinderGroup);
        for (Object next : this.mItems) {
            if (next instanceof C63613hu) {
                r1 = this.mSimpleBadgeHeaderPaddingState;
                l2e2 = this.mHeaderBinderGroup;
            } else if (next instanceof AnonymousClass4MA) {
                r1 = new C57583Bq(false, false, false, false);
                l2e2 = this.mMenuItemBinderGroup;
            } else {
                if (next instanceof AnonymousClass4MC) {
                    l2e = this.mSwitchBinderGroup;
                } else if (next instanceof C63273h9) {
                    l2e = this.mSeparatorBinderGroup;
                } else {
                    AnonymousClass0LU.A0B(TAG, StringFormatUtil.formatStrLocaleSafe("## Missing BinderGroup support=%s", (Object) next.toString()));
                }
                addModel(next, l2e);
            }
            addModel(next, r1, l2e2);
        }
        notifyDataSetChanged();
    }

    public void updateListView() {
        notifyDataSetChanged();
    }
}
