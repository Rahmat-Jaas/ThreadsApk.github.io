package com.instagram.debug.quickexperiment;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass1fz;
import X.AnonymousClass1g0;
import X.AnonymousClass1gO;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.C27900EvB;
import X.C34727Idy;
import X.C57583Bq;
import X.C63613hu;
import X.C83074qk;
import X.L2E;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

public class QuickExperimentEditAdapter extends C34727Idy implements C27900EvB {
    public static final Class TAG = QuickExperimentEditAdapter.class;
    public List mCategoryList = AnonymousClass0wJ.A0v();
    public final Context mContext;
    public final AnonymousClass1gO mHeaderBinderGroup;
    public final AnonymousClass1fz mMenuItemBinderGroup;
    public final AnonymousClass1g0 mSwitchBinderGroup;

    public QuickExperimentEditAdapter getAdapter() {
        return this;
    }

    public void setMenuItemList(List list) {
        this.mCategoryList.clear();
        this.mCategoryList.addAll(list);
        updateItems();
    }

    public QuickExperimentEditAdapter(Context context) {
        this.mContext = context;
        AnonymousClass1fz r3 = new AnonymousClass1fz(context);
        this.mMenuItemBinderGroup = r3;
        AnonymousClass1g0 r2 = new AnonymousClass1g0(context);
        this.mSwitchBinderGroup = r2;
        AnonymousClass1gO r0 = new AnonymousClass1gO(context, (C83074qk) null);
        this.mHeaderBinderGroup = r0;
        init(r0, r3, r2);
        updateItems();
    }

    private void updateItems() {
        L2E l2e;
        clear();
        for (Object next : this.mCategoryList) {
            if (next instanceof C63613hu) {
                l2e = this.mHeaderBinderGroup;
            } else if (next instanceof AnonymousClass4MA) {
                addModel(next, new C57583Bq(false, false, false, false), this.mMenuItemBinderGroup);
            } else if (next instanceof AnonymousClass4MC) {
                l2e = this.mSwitchBinderGroup;
            } else {
                AnonymousClass0LU.A01(TAG, StringFormatUtil.formatStrLocaleSafe("## Missing BinderGroup support=%s", (Object) next.toString()));
            }
            addModel(next, l2e);
        }
        updateListView();
    }
}
