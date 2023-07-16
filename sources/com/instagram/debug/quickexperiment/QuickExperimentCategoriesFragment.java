package com.instagram.debug.quickexperiment;

import X.AnonymousClass00U;
import X.AnonymousClass0gG;
import X.AnonymousClass0gN;
import X.AnonymousClass0wJ;
import X.AnonymousClass3IC;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C05050Qq;
import X.C07950cU;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C23411dm;
import X.C24;
import X.C25828Dsm;
import X.C27021rj;
import X.C40290Lbt;
import X.C41836MeS;
import X.C61823Vx;
import X.C63613hu;
import X.C63643hy;
import X.C63813iO;
import X.C64543mW;
import X.C82034oy;
import X.C82424pb;
import X.C83124qp;
import X.C83874s8;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class QuickExperimentCategoriesFragment extends C23411dm implements C82424pb, C83874s8, C82034oy, C83124qp {
    public static final Comparator PARAMETER_COMPARATOR = new Comparator() {
        public int compare(C07950cU r6, C07950cU r7) {
            C40290Lbt category = QuickExperimentHelper.getCategory(r6);
            C40290Lbt category2 = QuickExperimentHelper.getCategory(r7);
            String str = r6.mUniverseName;
            String str2 = r7.mUniverseName;
            if (!category.equals(category2)) {
                return category.compareTo(category2);
            }
            if (str.equalsIgnoreCase(str2)) {
                return r6.mName.compareTo(r7.mName);
            }
            return str.compareTo(str2);
        }
    };
    public QuickExperimentCategoriesAdapter mAdapter;
    public final List mCategoryList = AnonymousClass0wJ.A0v();
    public final C41836MeS mSearchExperimentsPredicate = new C41836MeS() {
        public boolean apply(C07950cU r5) {
            if (OverlayConfigHelper.isOverlayConfig(r5)) {
                return false;
            }
            if (C23411dm.A0A(this, QuickExperimentHelper.getNiceUniverseName(r5.mUniverseName).toLowerCase()) || C23411dm.A0A(this, r5.mName.replace("_", " ").toLowerCase()) || C23411dm.A0A(this, QuickExperimentCategoriesFragment.this.getUniverseAndParamName(r5)) || C23411dm.A0A(this, QuickExperimentCategoriesFragment.this.getUniverseAndParamNameWithUnderscores(r5))) {
                return true;
            }
            return false;
        }
    };
    public String mSearchQuery = "";
    public UserSession mSession;
    public TypeaheadHeader mTypeaheadHeader;

    public String getModuleName() {
        return "quick_experiment_categories";
    }

    /* access modifiers changed from: private */
    public String getUniverseAndParamName(C07950cU r5) {
        return AnonymousClass00U.A0V(QuickExperimentHelper.getNiceUniverseName(r5.mUniverseName).toLowerCase(), " ", r5.mName.replace("_", " ").toLowerCase(Locale.getDefault()));
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A08(r2, "Quick Experiment Categories");
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
                    QuickExperimentCategoriesFragment quickExperimentCategoriesFragment = QuickExperimentCategoriesFragment.this;
                    quickExperimentCategoriesFragment.filterExperimentsList(quickExperimentCategoriesFragment.mSearchQuery);
                }
            });
        } else {
            setItems(this.mSession, this.mCategoryList, false);
        }
    }

    private void checkMobileConfigIdNameMapping() {
        C25828Dsm A0V;
        AnonymousClass3IC paramsMap = QuickExperimentHelper.getParamsMap();
        if (paramsMap == null) {
            A0V = AnonymousClass0wJ.A0V(this);
            A0V.A0p("Overrides won't work due to failed to load MobileConfig params map.");
            A0V.A0c((DialogInterface.OnClickListener) null, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL);
        } else {
            double namedParamsRatio = QuickExperimentHelper.getNamedParamsRatio(paramsMap);
            if (namedParamsRatio < 0.9d) {
                A0V = AnonymousClass0wJ.A0V(this);
                A0V.A0p(StringFormatUtil.formatStrLocaleSafe("Overrides would be flaky due to only loaded config names for %.1f%% of %d params.\n\nSuggest to go parent menu and click \"Force user QE sync\", and then come back - or just click the button below.", Double.valueOf(namedParamsRatio * 100.0d), Integer.valueOf(paramsMap.A03.size())));
                A0V.A0c((DialogInterface.OnClickListener) null, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL);
                A0V.A0a(new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C61823Vx r4 = C61823Vx.A01;
                        QuickExperimentCategoriesFragment quickExperimentCategoriesFragment = QuickExperimentCategoriesFragment.this;
                        if (r4 == null) {
                            C63813iO.A01(quickExperimentCategoriesFragment.requireContext(), "Failed User QE Sync");
                            return;
                        }
                        Context requireContext = quickExperimentCategoriesFragment.requireContext();
                        QuickExperimentHelper.forceUserQESync(requireContext, r4, QuickExperimentCategoriesFragment.this.mSession, new QuickExperimentHelper$$ExternalSyntheticLambda7(requireContext, C18180wK.A0Y()));
                    }
                }, "Force sync and restart app");
            } else {
                return;
            }
        }
        AnonymousClass0wJ.A1K(A0V);
    }

    /* access modifiers changed from: private */
    public void filterExperimentsList(String str) {
        final ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : QuickExperimentHelper.getAllExperiments()) {
            if (!str.equals(this.mSearchQuery)) {
                return;
            }
            if (this.mSearchExperimentsPredicate.apply(next)) {
                A0v.add(next);
            }
        }
        Collections.sort(A0v, PARAMETER_COMPARATOR);
        C63643hy.A05(new Runnable() {
            public void run() {
                QuickExperimentCategoriesFragment quickExperimentCategoriesFragment = QuickExperimentCategoriesFragment.this;
                UserSession userSession = quickExperimentCategoriesFragment.mSession;
                quickExperimentCategoriesFragment.setItems(userSession, QuickExperimentHelper.setupMenuItems(quickExperimentCategoriesFragment, userSession, A0v, quickExperimentCategoriesFragment.mAdapter, true, true), true);
            }
        });
    }

    /* access modifiers changed from: private */
    public String getUniverseAndParamNameWithUnderscores(C07950cU r4) {
        return getUniverseAndParamName(r4).replace(" ", "_");
    }

    /* access modifiers changed from: private */
    public void setItems(UserSession userSession, List list, boolean z) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (!z) {
            C63613hu.A01("Recent Items", A0v);
            List recentExperimentParameters = RecentQuickExperimentManager.getRecentExperimentParameters();
            Collections.sort(recentExperimentParameters, PARAMETER_COMPARATOR);
            A0v.addAll(QuickExperimentHelper.setupMenuItems(this, userSession, recentExperimentParameters, this.mAdapter, false, true));
            C63613hu.A01("Quick Experiment Categories", A0v);
            AnonymousClass4MA.A02(new View.OnClickListener() {
                public void onClick(View view) {
                    int A05 = C14030oh.A05(-309335810);
                    C05050Qq.A00(C18180wK.A06(), QuickExperimentCategoriesFragment.this.mSession);
                    C18180wK.A17(QuickExperimentEditFragment.createForAllOverrides(QuickExperimentCategoriesFragment.this.mSession), C18180wK.A0Q(QuickExperimentCategoriesFragment.this.requireActivity(), QuickExperimentCategoriesFragment.this.mSession));
                    C14030oh.A0C(1173272070, A05);
                }
            }, "Show all overridden experiments", A0v);
        }
        A0v.addAll(list);
        this.mAdapter.setMenuItemList(A0v);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1385822779);
        super.onCreate(bundle);
        this.mSession = AnonymousClass0wJ.A0W(this);
        this.mAdapter = new QuickExperimentCategoriesAdapter(requireContext(), this, C18180wK.A0Y());
        for (final C40290Lbt lbt : C40290Lbt.values()) {
            this.mCategoryList.add(AnonymousClass4MA.A01(new View.OnClickListener() {
                public void onClick(View view) {
                    int A05 = C14030oh.A05(-535818880);
                    TypeaheadHeader typeaheadHeader = QuickExperimentCategoriesFragment.this.mTypeaheadHeader;
                    if (typeaheadHeader != null) {
                        typeaheadHeader.A01();
                    }
                    C05050Qq.A00(C18180wK.A06(), QuickExperimentCategoriesFragment.this.mSession);
                    C18180wK.A17(QuickExperimentEditFragment.createWithExperimentCategory(lbt), C18180wK.A0Q(QuickExperimentCategoriesFragment.this.requireActivity(), QuickExperimentCategoriesFragment.this.mSession));
                    C14030oh.A0C(1533550315, A05);
                }
            }, lbt.A01));
        }
        C14030oh.A09(1858468086, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        checkMobileConfigIdNameMapping();
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
                int A03 = C14030oh.A03(-1602280209);
                if (i == 1) {
                    QuickExperimentCategoriesFragment.this.mTypeaheadHeader.A01();
                }
                C14030oh.A0A(-309799471, A03);
            }
        });
        C18200wM.A0H(this).setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        getScrollingViewProxy().ChZ(this.mAdapter);
        setItems(this.mSession, this.mCategoryList, false);
    }
}
