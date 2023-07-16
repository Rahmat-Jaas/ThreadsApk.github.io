package com.instagram.debug.quickexperiment;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass1fz;
import X.AnonymousClass1g0;
import X.AnonymousClass1gO;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.C23871fu;
import X.C24031gm;
import X.C27900EvB;
import X.C34727Idy;
import X.C57583Bq;
import X.C63273h9;
import X.C63613hu;
import X.C83074qk;
import X.C83124qp;
import X.L2E;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

public class QuickExperimentCategoriesAdapter extends C34727Idy implements C27900EvB {
    public static final Class TAG = QuickExperimentCategoriesAdapter.class;
    public List mCategoryList = AnonymousClass0wJ.A0v();
    public final AnonymousClass1gO mHeaderBinderGroup;
    public final AnonymousClass1fz mMenuItemBinderGroup;
    public final C23871fu mSeparatorBinderGroup;
    public final AnonymousClass1g0 mSwitchBinderGroup;
    public final C24031gm mTypeaheadHeaderBinderGroup;
    public final boolean mUseRecyclerView;

    public QuickExperimentCategoriesAdapter getAdapter() {
        return this;
    }

    public void setMenuItemList(List list) {
        this.mCategoryList.clear();
        this.mCategoryList.addAll(list);
        updateItems();
    }

    public void updateListView() {
        if (this.mUseRecyclerView) {
            notifyDataSetChanged();
        } else {
            super.updateListView();
        }
    }

    public QuickExperimentCategoriesAdapter(Context context, C83124qp r8, Boolean bool) {
        AnonymousClass1fz r5 = new AnonymousClass1fz(context);
        this.mMenuItemBinderGroup = r5;
        AnonymousClass1gO r4 = new AnonymousClass1gO(context, (C83074qk) null);
        this.mHeaderBinderGroup = r4;
        C24031gm r3 = new C24031gm(r8);
        this.mTypeaheadHeaderBinderGroup = r3;
        AnonymousClass1g0 r2 = new AnonymousClass1g0(context);
        this.mSwitchBinderGroup = r2;
        C23871fu r1 = new C23871fu(context);
        this.mSeparatorBinderGroup = r1;
        this.mUseRecyclerView = bool.booleanValue();
        init(r4, r5, r2, r3, r1);
        updateItems();
    }

    private void updateItems() {
        L2E l2e;
        clear();
        addModel((Object) null, this.mTypeaheadHeaderBinderGroup);
        for (Object next : this.mCategoryList) {
            if (next instanceof C63613hu) {
                l2e = this.mHeaderBinderGroup;
            } else if (next instanceof AnonymousClass4MA) {
                addModel(next, new C57583Bq(false, false, false, false), this.mMenuItemBinderGroup);
            } else if (next instanceof AnonymousClass4MC) {
                l2e = this.mSwitchBinderGroup;
            } else if (next instanceof C63273h9) {
                l2e = this.mSeparatorBinderGroup;
            } else {
                AnonymousClass0LU.A01(TAG, StringFormatUtil.formatStrLocaleSafe("## Missing BinderGroup support=%s", (Object) next.toString()));
            }
            addModel(next, l2e);
        }
        updateListView();
    }
}
