package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.AnonymousClass8AP;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C18210wN;
import X.C29681z6;
import X.C29691z7;
import X.C34640IcN;
import X.C35692Ol;
import X.C35702Om;
import X.C63793iM;
import X.C80644m9;
import X.C82034oy;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.service.session.UserSession;
import fxcache.model.FxCalAccount;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FXPFLinkageCacheDebugFragment extends C34640IcN implements C82034oy {
    public static final String ACCOUNT_ID = "Account Id: ";
    public static final Companion Companion = new Companion();
    public static final String FXAIC_QUERY = "FxAICQuery";
    public static final String MASTER_ACCOUNT_QUERY = "MasterAccountQuery";
    public static final String OB_ID = "ObId: ";
    public static final String REFRESH = "refresh";
    public static final String USERNAME = "Username: ";
    public static final String callerName = "ig_android_linking_cache_fx_internal";
    public static final String nullString = "NULL";
    public C29681z6 accountCache;
    public C29691z7 accountCacheHelper;
    public final CallerContext callerContext = CallerContext.A01("FXPFLinkageCacheDebugFragment");
    public final LinearLayout.LayoutParams componentLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    public IgLinearLayout dataContainer;
    public IgTextView header;
    public final LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    public final String[] queries = {MASTER_ACCOUNT_QUERY, FXAIC_QUERY};
    public Spinner querySelector;
    public IgTextView timestamp;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public String getModuleName() {
        return "fx_pf_obid_migration_linking_cache_library_data";
    }

    public static /* synthetic */ TextView createTextView$default(FXPFLinkageCacheDebugFragment fXPFLinkageCacheDebugFragment, String str, LinearLayout.LayoutParams layoutParams, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            layoutParams = fXPFLinkageCacheDebugFragment.componentLayoutParams;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return fXPFLinkageCacheDebugFragment.createTextView(str, layoutParams, z, z2);
    }

    /* access modifiers changed from: private */
    public final void genData() {
        IgLinearLayout igLinearLayout = this.dataContainer;
        String str = "dataContainer";
        if (igLinearLayout != null) {
            igLinearLayout.removeAllViews();
            C29681z6 r0 = this.accountCache;
            String str2 = "accountCache";
            if (r0 != null) {
                CallerContext callerContext2 = this.callerContext;
                C04220Ms.A0B(callerContext2, 1);
                List A03 = r0.A00.A03(callerContext2, callerName, "FACEBOOK");
                C29681z6 r02 = this.accountCache;
                if (r02 != null) {
                    CallerContext callerContext3 = this.callerContext;
                    C04220Ms.A0B(callerContext3, 1);
                    List A032 = r02.A00.A03(callerContext3, callerName, "INSTAGRAM");
                    String string = getString(2131827807, C18210wN.A1Y(Integer.valueOf(A03.size()), A032.size()));
                    C04220Ms.A06(string);
                    IgTextView igTextView = this.header;
                    str2 = "header";
                    if (igTextView != null) {
                        igTextView.setText(string);
                        IgTextView igTextView2 = this.header;
                        if (igTextView2 != null) {
                            igTextView2.setLayoutParams(this.componentLayoutParams);
                            IgLinearLayout igLinearLayout2 = this.dataContainer;
                            if (igLinearLayout2 != null) {
                                igLinearLayout2.addView(createContentContainer("FB Accounts", A03));
                                IgLinearLayout igLinearLayout3 = this.dataContainer;
                                if (igLinearLayout3 != null) {
                                    igLinearLayout3.addView(createContentContainer("IG Accounts", A032));
                                    IgTextView igTextView3 = this.timestamp;
                                    str = "timestamp";
                                    if (igTextView3 != null) {
                                        igTextView3.setText(getTimestamp());
                                        IgTextView igTextView4 = this.timestamp;
                                        if (igTextView4 != null) {
                                            igTextView4.setLayoutParams(this.componentLayoutParams);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C04220Ms.A0E(str2);
            throw null;
        }
        C04220Ms.A0E(str);
        throw null;
    }

    private final String getTimestamp() {
        C29691z7 r0 = this.accountCacheHelper;
        if (r0 == null) {
            C04220Ms.A0E("accountCacheHelper");
            throw null;
        }
        String format = DateFormat.getDateTimeInstance().format(new Date(r0.A00.A00));
        C04220Ms.A06(format);
        return format;
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    private final void setQuerySelectorOnInit() {
        String[] strArr;
        String str;
        boolean A0E = C63793iM.A0E(AnonymousClass0wJ.A0X(this.userSession$delegate));
        Spinner spinner = this.querySelector;
        if (A0E) {
            if (spinner != null) {
                strArr = this.queries;
                str = FXAIC_QUERY;
            }
            C04220Ms.A0E("querySelector");
            throw null;
        }
        if (spinner != null) {
            strArr = this.queries;
            str = MASTER_ACCOUNT_QUERY;
        }
        C04220Ms.A0E("querySelector");
        throw null;
        spinner.setSelection(AnonymousClass8AP.A01(strArr, str));
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A08(r2, "FX PF Linkage Cache Debug Tool");
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final View createContentContainer(String str, List list) {
        IgLinearLayout igLinearLayout = new IgLinearLayout(requireContext());
        igLinearLayout.setOrientation(1);
        igLinearLayout.addView(createTextView(str, this.componentLayoutParams, true, false));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FxCalAccount fxCalAccount = (FxCalAccount) it.next();
            igLinearLayout.addView(createContentRow(ACCOUNT_ID, fxCalAccount.A01));
            String str2 = fxCalAccount.A07;
            String str3 = nullString;
            if (str2 == null) {
                str2 = str3;
            }
            igLinearLayout.addView(createContentRow(USERNAME, str2));
            String str4 = fxCalAccount.A05;
            if (str4 != null) {
                str3 = str4;
            }
            igLinearLayout.addView(createContentRow(OB_ID, str3));
            igLinearLayout.addView(getDivider());
        }
        return igLinearLayout;
    }

    private final View createContentRow(String str, String str2) {
        IgLinearLayout igLinearLayout = new IgLinearLayout(requireContext());
        igLinearLayout.setOrientation(0);
        igLinearLayout.setLayoutParams(this.linearLayoutParams);
        igLinearLayout.addView(createTextView(str, this.componentLayoutParams, false, false));
        igLinearLayout.addView(createTextView(str2, this.componentLayoutParams, false, true));
        return igLinearLayout;
    }

    private final TextView createTextView(String str, LinearLayout.LayoutParams layoutParams, boolean z, boolean z2) {
        IgTextView igTextView = new IgTextView(requireContext());
        igTextView.setText(str);
        igTextView.setLayoutParams(layoutParams);
        if (z) {
            igTextView.setTypeface((Typeface) null, 1);
        }
        if (z2) {
            igTextView.setOnClickListener(new FXPFLinkageCacheDebugFragment$createTextView$1(this, str));
        }
        return igTextView;
    }

    private final View getDivider() {
        View view = new View(requireContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        view.setBackgroundResource(R.color.grey_2_30_transparent);
        return view;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-824067798);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.product_foundations_internal_settings_debug_fragment, viewGroup, false);
        this.accountCache = C35692Ol.A00(AnonymousClass0wJ.A0X(this.userSession$delegate));
        this.accountCacheHelper = C35702Om.A00(AnonymousClass0wJ.A0X(this.userSession$delegate));
        this.header = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.header);
        this.dataContainer = (IgLinearLayout) AnonymousClass0wJ.A0J(inflate, R.id.container);
        this.timestamp = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.timestamp);
        this.querySelector = (Spinner) AnonymousClass0wJ.A0J(inflate, R.id.query_selector);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.button);
        this.linearLayoutParams.setMargins(32, 8, 4, 8);
        this.componentLayoutParams.setMargins(16, 0, 4, 0);
        genData();
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), 17367048, this.queries);
        arrayAdapter.setDropDownViewResource(17367049);
        Spinner spinner = this.querySelector;
        if (spinner == null) {
            C04220Ms.A0E("querySelector");
            throw null;
        }
        spinner.setAdapter(arrayAdapter);
        setQuerySelectorOnInit();
        textView.setOnClickListener(new FXPFLinkageCacheDebugFragment$onCreateView$1(this, new FXPFLinkageCacheDebugFragment$onCreateView$listener$1(this)));
        textView.setText(REFRESH);
        C14030oh.A09(-1550056909, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
