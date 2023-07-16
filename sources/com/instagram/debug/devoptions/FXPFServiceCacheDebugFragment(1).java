package com.instagram.debug.devoptions;

import X.AnonymousClass00J;
import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass20H;
import X.AnonymousClass3VT;
import X.AnonymousClass3VW;
import X.AnonymousClass3VZ;
import X.AnonymousClass49R;
import X.AnonymousClass4WL;
import X.AnonymousClass4WM;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C28174Ezk;
import X.C34640IcN;
import X.C80644m9;
import X.C82034oy;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.service.session.UserSession;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55;

public final class FXPFServiceCacheDebugFragment extends C34640IcN implements C82034oy {
    public static final String CUSTOM_DATA = "Custom data fields: ";
    public static final Companion Companion = new Companion();
    public static final String DEST_ID = "Destination ID: ";
    public static final String DEST_ID_TYPE = "Destination ID type: ";
    public static final String OB_DEST_ID = "Obfuscated destination ID: ";
    public static final String REFRESH = "Refresh";
    public static final String SOURCE_ID = "Source ID: ";
    public static final String STATUS = "Status: ";
    public static final String SUMMARY = "Cache contains data for %d services.";
    public static final String TIMESTAMP = "Last updated: ";
    public final List allowedServicesList;
    public final CallerContext callerContext = CallerContext.A01("FXPFServiceCacheDebugFragment");
    public final LinearLayout.LayoutParams componentLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    public IgLinearLayout dataContainer;
    public IgTextView header;
    public final LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    public AnonymousClass49R serviceCacheHelper;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    private final View createContentRow(String str, String str2, int i, boolean z) {
        Typeface typeface;
        IgLinearLayout igLinearLayout = new IgLinearLayout(requireContext());
        igLinearLayout.setOrientation(0);
        igLinearLayout.setLayoutParams(getContentRowLayout(i));
        if (z) {
            typeface = Typeface.MONOSPACE;
        } else {
            typeface = Typeface.DEFAULT;
        }
        igLinearLayout.addView(createTextView(str, this.componentLayoutParams, 0, typeface, 14.0f));
        String str3 = str2;
        igLinearLayout.addView(createTextView(str3, this.componentLayoutParams, 0, Typeface.MONOSPACE, 14.0f));
        return igLinearLayout;
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void genData() {
        /*
            r13 = this;
            r7 = r13
            com.instagram.common.ui.base.IgLinearLayout r0 = r13.dataContainer
            java.lang.String r6 = "dataContainer"
            if (r0 == 0) goto L_0x00d9
            r0.removeAllViews()
            X.49R r2 = r13.serviceCacheHelper
            java.lang.String r5 = "serviceCacheHelper"
            if (r2 == 0) goto L_0x00dd
            com.facebook.common.callercontext.CallerContext r1 = r13.callerContext
            java.util.List r0 = r13.allowedServicesList
            java.lang.String r4 = "ig_android_service_cache_fx_internal"
            java.util.Map r9 = r2.A01(r1, r4, r0)
            X.49R r2 = r13.serviceCacheHelper
            if (r2 == 0) goto L_0x00dd
            com.facebook.common.callercontext.CallerContext r1 = r13.callerContext
            java.util.List r0 = r13.allowedServicesList
            java.util.Map r10 = r2.A00(r1, r4, r0)
            X.49R r2 = r13.serviceCacheHelper
            if (r2 == 0) goto L_0x00dd
            com.facebook.common.callercontext.CallerContext r1 = r13.callerContext
            java.util.List r3 = r13.allowedServicesList
            X.AnonymousClass0wJ.A1O(r1, r3)
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x008a
            boolean r0 = r2.A08(r4)
            if (r0 == 0) goto L_0x008a
            X.AnonymousClass49V.A00(r1, r2, r4, r3)
            java.util.Map r0 = r2.A01
            java.util.LinkedHashMap r2 = X.C18220wO.A0y()
            java.util.Iterator r1 = X.AnonymousClass0wJ.A0z(r0)
        L_0x004a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0058
            java.util.Map$Entry r0 = X.C18180wK.A0o(r1)
            X.C18190wL.A1V(r2, r3, r0)
            goto L_0x004a
        L_0x0058:
            int r0 = r2.size()
            int r0 = X.AnonymousClass4WK.A0N(r0)
            java.util.LinkedHashMap r11 = X.C18190wL.A0v(r0)
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x006c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008e
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.3VZ r0 = (X.AnonymousClass3VZ) r0
            java.util.HashMap r0 = r0.A02
            java.util.Map r0 = X.AnonymousClass4WJ.A0E(r0)
            r11.put(r1, r0)
            goto L_0x006c
        L_0x008a:
            X.4To r11 = X.AnonymousClass4To.A00()
        L_0x008e:
            X.49R r0 = r13.serviceCacheHelper
            if (r0 == 0) goto L_0x00dd
            com.google.common.collect.ImmutableMap$Builder r1 = new com.google.common.collect.ImmutableMap$Builder
            r1.<init>()
            java.util.Map r0 = r0.A01
            r1.putAll((java.util.Map) r0)
            com.google.common.collect.ImmutableMap r12 = r1.build()
            X.C04220Ms.A06(r12)
            com.instagram.common.ui.base.IgTextView r2 = r13.header
            java.lang.String r5 = "header"
            if (r2 == 0) goto L_0x00dd
            r1 = 1
            int r0 = r9.size()
            java.lang.Object[] r0 = X.C18210wN.A1X(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "Cache contains data for %d services."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.C04220Ms.A06(r0)
            r2.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r13.header
            if (r1 == 0) goto L_0x00dd
            android.widget.LinearLayout$LayoutParams r0 = r13.componentLayoutParams
            r1.setLayoutParams(r0)
            com.instagram.common.ui.base.IgLinearLayout r1 = r13.dataContainer
            if (r1 == 0) goto L_0x00d9
            java.lang.String r8 = "Services"
            android.view.View r0 = r7.createContentContainer(r8, r9, r10, r11, r12)
            r1.addView(r0)
            return
        L_0x00d9:
            X.C04220Ms.A0E(r6)
            goto L_0x00e0
        L_0x00dd:
            X.C04220Ms.A0E(r5)
        L_0x00e0:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.FXPFServiceCacheDebugFragment.genData():void");
    }

    private final LinearLayout.LayoutParams getContentRowLayout(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins((i << 3) + 32, 8, 4, 8);
        return layoutParams;
    }

    public String getModuleName() {
        return "fx_pf_service_cache_library_data";
    }

    private final View createContentContainer(String str, Map map, Map map2, Map map3, Map map4) {
        int i;
        long j;
        IgLinearLayout igLinearLayout = new IgLinearLayout(requireContext());
        igLinearLayout.setOrientation(1);
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry entry = (Map.Entry) A0z.next();
            igLinearLayout.addView(createTextView((String) entry.getKey(), this.componentLayoutParams, 1, (Typeface) null, 14.0f));
            igLinearLayout.addView(createContentRow(STATUS, (String) entry.getValue(), 0, false));
            Iterable<AnonymousClass3VT> iterable = (Iterable) map2.get(entry.getKey());
            if (iterable != null) {
                for (AnonymousClass3VT r4 : iterable) {
                    igLinearLayout.addView(createContentRow(SOURCE_ID, r4.A00, 0, false));
                    for (AnonymousClass3VW r6 : r4.A01) {
                        igLinearLayout.addView(createContentRow(DEST_ID, r6.A00, 8, false));
                        igLinearLayout.addView(createContentRow(OB_DEST_ID, r6.A02, 8, false));
                        igLinearLayout.addView(createContentRow(DEST_ID_TYPE, r6.A01, 8, false));
                    }
                }
            }
            Map map5 = map3;
            Map map6 = (Map) map5.get(entry.getKey());
            if (map6 != null) {
                i = map6.size();
            } else {
                i = 0;
            }
            igLinearLayout.addView(createContentRow(CUSTOM_DATA, String.valueOf(i), 0, false));
            Map map7 = (Map) map5.get(entry.getKey());
            if (map7 != null) {
                Iterator A0z2 = AnonymousClass0wJ.A0z(map7);
                while (A0z2.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0z2);
                    igLinearLayout.addView(createContentRow(AnonymousClass00U.A0L(C18200wM.A0p(A0o), " → "), C18230wP.A0u(A0o), 8, true));
                }
            }
            AnonymousClass3VZ r0 = (AnonymousClass3VZ) map4.get(entry.getKey());
            if (r0 != null) {
                j = r0.A00;
            } else {
                j = 0;
            }
            igLinearLayout.addView(createContentRow(TIMESTAMP, getTimestamp(j), 0, false));
            igLinearLayout.addView(getDivider());
        }
        return igLinearLayout;
    }

    public static /* synthetic */ TextView createTextView$default(FXPFServiceCacheDebugFragment fXPFServiceCacheDebugFragment, String str, LinearLayout.LayoutParams layoutParams, int i, Typeface typeface, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            layoutParams = fXPFServiceCacheDebugFragment.componentLayoutParams;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            typeface = null;
        }
        if ((i2 & 16) != 0) {
            f = 14.0f;
        }
        return fXPFServiceCacheDebugFragment.createTextView(str, layoutParams, i, typeface, f);
    }

    private final String getTimestamp(long j) {
        String format = DateFormat.getDateTimeInstance().format(new Date(j));
        C04220Ms.A06(format);
        return format;
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A08(r2, "FX PF Service Cache Debug Tool");
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public FXPFServiceCacheDebugFragment() {
        ArrayList A0k = C18240wQ.A0k(r3);
        for (AnonymousClass20H A1O : AnonymousClass20H.values()) {
            C18230wP.A1O(A1O, A0k);
        }
        Set A00 = AnonymousClass4WL.A00(AnonymousClass4WM.A08("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", "BLOCKCHAIN_ACCOUNT_CONNECTION_SHARING"), C18250wR.A0c(A0k));
        C04220Ms.A0C(A00, C28174Ezk.A00(239));
        this.allowedServicesList = AnonymousClass00J.A0N(A00);
    }

    public static /* synthetic */ View createContentRow$default(FXPFServiceCacheDebugFragment fXPFServiceCacheDebugFragment, String str, String str2, int i, boolean z, int i2, Object obj) {
        int A00 = C18220wO.A00(i2, i);
        if ((i2 & 8) != 0) {
            z = false;
        }
        return fXPFServiceCacheDebugFragment.createContentRow(str, str2, A00, z);
    }

    private final TextView createTextView(String str, LinearLayout.LayoutParams layoutParams, int i, Typeface typeface, float f) {
        IgTextView igTextView = new IgTextView(requireContext());
        igTextView.setText(str);
        igTextView.setLayoutParams(layoutParams);
        igTextView.setTypeface(typeface, i);
        igTextView.setTextSize(f);
        return igTextView;
    }

    private final View getDivider() {
        View view = new View(requireContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        view.setBackgroundResource(R.color.grey_1_70_transparent);
        return view;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(596575943);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fx_pf_service_cache_debug_fragment, viewGroup, false);
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        C04220Ms.A0B(A0X, 0);
        this.serviceCacheHelper = (AnonymousClass49R) A0X.A01(AnonymousClass49R.class, new KtLambdaShape75S0100000_I2_55(A0X, 38));
        this.header = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.service_cache_header);
        this.dataContainer = (IgLinearLayout) AnonymousClass0wJ.A0J(inflate, R.id.service_cache_container);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.service_cache_button);
        this.linearLayoutParams.setMargins(32, 8, 4, 8);
        this.componentLayoutParams.setMargins(16, 0, 4, 0);
        genData();
        textView.setOnClickListener(new FXPFServiceCacheDebugFragment$onCreateView$1(this, new FXPFServiceCacheDebugFragment$onCreateView$listener$1(this)));
        textView.setText(REFRESH);
        C14030oh.A09(-1553655857, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
