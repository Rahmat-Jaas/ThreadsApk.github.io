package com.instagram.debug.quickexperiment;

import X.AnonymousClass0gG;
import X.AnonymousClass0gN;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C07950cU;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18200wM;
import X.C23411dm;
import X.C24;
import X.C27021rj;
import X.C41836MeS;
import X.C63643hy;
import X.C64543mW;
import X.C82034oy;
import X.C82424pb;
import X.C83124qp;
import X.C83874s8;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OverlayConfigEditFragment extends C23411dm implements C82424pb, C83874s8, C82034oy, C83124qp {
    public static final String TITLE = "Edit Overlay Configs";
    public OverlayConfigEditAdapter mAdapter;
    public List mOverlayConfigsList = AnonymousClass0wJ.A0v();
    public final C41836MeS mSearchOverlayConfigPredicate = new C41836MeS() {
        public boolean apply(C07950cU r5) {
            if (!OverlayConfigHelper.isOverlayConfig(r5)) {
                return false;
            }
            if (QuickExperimentHelper.getNiceUniverseName(r5.mUniverseName).toLowerCase().contains(OverlayConfigEditFragment.this.mSearchQuery.toLowerCase()) || r5.mName.replace("_", " ").toLowerCase().contains(OverlayConfigEditFragment.this.mSearchQuery.toLowerCase())) {
                return true;
            }
            return false;
        }
    };
    public String mSearchQuery = "";
    public UserSession mSession;
    public TypeaheadHeader mTypeaheadHeader;

    public String getModuleName() {
        return "overlay_config_edit";
    }

    /* access modifiers changed from: private */
    public void setItems(List list, boolean z) {
        OverlayConfigEditAdapter overlayConfigEditAdapter = this.mAdapter;
        overlayConfigEditAdapter.setMenuItemList(QuickExperimentHelper.setupMenuItems(this, this.mSession, list, overlayConfigEditAdapter, false));
    }

    private void sortOverlayConfigList(List list) {
        Collections.sort(list, new Comparator() {
            public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return C18190wL.A06((C07950cU) obj, (C07950cU) obj2);
            }

            public int compare(C07950cU r2, C07950cU r3) {
                return C18190wL.A06(r2, r3);
            }
        });
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A08(r2, TITLE);
    }

    public View getRowView() {
        return this.mTypeaheadHeader;
    }

    public C10300i6 getSession() {
        return this.mSession;
    }

    public boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.mTypeaheadHeader;
        if (typeaheadHeader == null) {
            return false;
        }
        typeaheadHeader.A01();
        return false;
    }

    public void registerTextViewLogging(TextView textView) {
        textView.addTextChangedListener(C64543mW.A00(this.mSession));
    }

    public void searchTextChanged(String str) {
        this.mSearchQuery = str;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass0gN.A00().AKp(new AnonymousClass0gG(1386848661) {
                public void run() {
                    OverlayConfigEditFragment overlayConfigEditFragment = OverlayConfigEditFragment.this;
                    overlayConfigEditFragment.filterOverlayConfigList(overlayConfigEditFragment.mSearchQuery);
                }
            });
        } else {
            setItems(this.mOverlayConfigsList, false);
        }
    }

    /* access modifiers changed from: private */
    public void filterOverlayConfigList(String str) {
        final ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : QuickExperimentHelper.getAllExperiments()) {
            if (!str.equals(this.mSearchQuery)) {
                return;
            }
            if (this.mSearchOverlayConfigPredicate.apply(next)) {
                A0v.add(next);
            }
        }
        sortOverlayConfigList(A0v);
        C63643hy.A05(new Runnable() {
            public void run() {
                OverlayConfigEditFragment.this.setItems(A0v, true);
            }
        });
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-873723397);
        super.onCreate(bundle);
        this.mSession = AnonymousClass0wJ.A0W(this);
        this.mAdapter = new OverlayConfigEditAdapter(requireContext(), this);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (C07950cU r1 : QuickExperimentHelper.getAllExperiments()) {
            if (OverlayConfigHelper.isOverlayConfig(r1)) {
                A0v.add(r1);
            }
        }
        this.mOverlayConfigsList = A0v;
        sortOverlayConfigList(A0v);
        C14030oh.A09(2129308742, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TypeaheadHeader typeaheadHeader = new TypeaheadHeader(requireContext());
        this.mTypeaheadHeader = typeaheadHeader;
        typeaheadHeader.A01 = this;
        C18200wM.A1C(typeaheadHeader);
        if (!TextUtils.isEmpty(this.mSearchQuery)) {
            TypeaheadHeader typeaheadHeader2 = this.mTypeaheadHeader;
            typeaheadHeader2.A00.setText(this.mSearchQuery);
        }
        this.mTypeaheadHeader.A00.setHint("Search Quick Experiments");
        getScrollingViewProxy().A7b(new C27021rj() {
            public void onScrollStateChanged(C24 c24, int i) {
                int A03 = C14030oh.A03(-1769412514);
                if (i == 1) {
                    OverlayConfigEditFragment.this.mTypeaheadHeader.A01();
                }
                C14030oh.A0A(444555902, A03);
            }
        });
        C18200wM.A0H(this).setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        getScrollingViewProxy().ChZ(this.mAdapter);
        setItems(this.mOverlayConfigsList, false);
    }
}
