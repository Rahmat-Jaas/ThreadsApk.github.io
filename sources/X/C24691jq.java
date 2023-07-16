package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.redex.IDxCListenerShape217S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape447S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.debug.sandbox.SandboxUtil;
import com.instagram.fx.access.sso.FxSsoViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1jq  reason: invalid class name and case insensitive filesystem */
public final class C24691jq extends C19819BBt {
    public C24751jz A00;
    public AnonymousClass1XW A01 = null;
    public boolean A02;
    public C24661jn A03;
    public final FragmentActivity A04;
    public final C34640IcN A05;
    public final C07530bf A06;
    public final AnonymousClass265 A07;
    public final C82394pY A08 = C18220wO.A0P(this, 62);

    public final void onCreate() {
        FragmentActivity fragmentActivity;
        boolean z;
        C07530bf r4 = this.A06;
        C34640IcN icN = this.A05;
        AnonymousClass265 r11 = this.A07;
        C34640IcN icN2 = icN;
        this.A00 = new C24751jz(icN2, icN2, (FxSsoViewModel) null, r4, r11, (String) null);
        if (C120647Bw.A00()) {
            C10450iM.A03("failed_to_load_library_logged_out", "failed_to_load_library_logged_out");
            FragmentActivity fragmentActivity2 = this.A04;
            C25828Dsm A0W = C18190wL.A0W(fragmentActivity2);
            A0W.A0q(false);
            A0W.A0L(2131826851);
            C18220wO.A14(fragmentActivity2, A0W, 2131837207);
            C18180wK.A1O(A0W, this, 128, 2131831976);
            AnonymousClass0wJ.A1K(A0W);
        }
        try {
            C09140ev r0 = C09140ev.A02;
            fragmentActivity = this.A04;
            r0.A05(fragmentActivity);
        } catch (RuntimeException unused) {
            C10450iM.A03("failed_to_write_to_fs", "logged out");
            IDxCListenerShape217S0100000_1_I2 A0O = C18220wO.A0O(this, 129);
            fragmentActivity = this.A04;
            C25828Dsm A0W2 = C18190wL.A0W(fragmentActivity);
            A0W2.A0Z(A0O, AnonymousClass0wJ.A0l(fragmentActivity, "http://bit.ly/igfilesystem", 2131834060), "http://bit.ly/igfilesystem");
            C18180wK.A1O(A0W2, this, 130, 2131826195);
            AnonymousClass0wJ.A1K(A0W2);
        }
        Object systemService = fragmentActivity.getSystemService("connectivity");
        systemService.getClass();
        String A062 = AnonymousClass0fS.A06(((ConnectivityManager) systemService).getActiveNetworkInfo());
        Intent A0B = C18230wP.A0B();
        A0B.setClassName("com.facebook.katana", "com.facebook.katana.ProxyAuth");
        boolean z2 = false;
        ResolveInfo resolveActivity = fragmentActivity.getPackageManager().resolveActivity(A0B, 0);
        if (resolveActivity != null) {
            try {
                Signature[] signatureArr = fragmentActivity.getPackageManager().getPackageInfo(resolveActivity.activityInfo.packageName, 64).signatures;
                int length = signatureArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (signatureArr[i].toCharsString().equals("30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2")) {
                        z2 = true;
                        break;
                    } else {
                        i++;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        C13330nS A022 = C13330nS.A02(r4);
        long currentTimeMillis = System.currentTimeMillis();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A022, "landing_created"), 2364);
        A0I.A0T("waterfall_id", AnonymousClass269.A04());
        A0I.A0T("containermodule", "waterfall_log_in");
        A0I.A0R("elapsed_time", Double.valueOf((double) (currentTimeMillis - AnonymousClass269.A01())));
        A0I.A0R(TraceFieldType.StartTime, Double.valueOf(AnonymousClass269.A00()));
        String str = r11.A01;
        A0I.A0Q("is_facebook_app_installed", C18190wL.A0Z(A0I, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str, z2));
        C09140ev r13 = C09140ev.A02;
        A0I.A0T("guid", r13.A04(C10600ic.A00));
        synchronized (C63593hs.class) {
            z = C63593hs.A00.A00.getBoolean("did_facebook_sso", false);
        }
        A0I.A0Q("did_facebook_sso", Boolean.valueOf(z));
        A0I.A0Q("did_log_in", Boolean.valueOf(C63593hs.A05()));
        A0I.A0T(TraceFieldType.NetworkType, A062);
        A0I.A0T("app_lang", C31103Gfm.A02().toString());
        A0I.A0T("device_lang", C31103Gfm.A03().toString());
        A0I.A0T("funnel_name", r11.A00);
        A0I.A0S("current_time", Long.valueOf(currentTimeMillis));
        A0I.Bb4();
        AnonymousClass0gN.A00().AKp(new AnonymousClass1m7(fragmentActivity));
        String moduleName = icN.getModuleName();
        AnonymousClass0wJ.A1M(r4, 0, moduleName);
        String A0l = C18190wL.A0l(r4);
        if (A0l != null && A0l.length() != 0) {
            USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r4), "send_phone_id_request"), 2688);
            String A0m = C18190wL.A0m(r4);
            double A002 = C18200wM.A00();
            if (AnonymousClass0wJ.A1U(A0I2)) {
                A0I2.A0R("current_time", Double.valueOf(A002));
                A0I2.A0R("elapsed_time", Double.valueOf(A002 - AnonymousClass269.A00()));
                C63683i7.A04(A0I2);
                A0I2.A0T("containermodule", moduleName);
                A0I2.A0T("prefill_type", "both");
                A0I2.A0R(TraceFieldType.StartTime, Double.valueOf(AnonymousClass269.A00()));
                A0I2.A0T("waterfall_id", AnonymousClass269.A04());
                A0I2.A0T(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
                C63683i7.A07(A0I2);
                C63683i7.A06(A0I2, r4);
                A0I2.A0T("guid", r13.A04(C10600ic.A00));
                A0I2.A0T("source", A0m);
                A0I2.Bb4();
            }
            AnonymousClass7Ko.A0B(true);
            H1T A0N = AnonymousClass0wJ.A0N(r4);
            A0N.A0J("accounts/contact_point_prefill/");
            A0N.A0O("usage", "prefill");
            A0N.A0O("phone_id", A0l);
            C32165H8c A0T = C18180wK.A0T(A0N, AnonymousClass1TS.class, AnonymousClass3PZ.class);
            A0T.A00 = new C24391ic(r4, str, moduleName);
            C31155GhB.A03(A0T);
        }
    }

    public final void onDestroyView() {
        this.A05.unregisterLifecycleListener(this.A03);
        C38040KHr.A01.A04(this.A08, AnonymousClass45A.class);
    }

    public final void onPause() {
        AnonymousClass1XW r0 = this.A01;
        if (r0 != null) {
            r0.A06();
        }
    }

    public C24691jq(FragmentActivity fragmentActivity, C34640IcN icN, C07530bf r4, AnonymousClass265 r5) {
        this.A06 = r4;
        this.A04 = fragmentActivity;
        this.A05 = icN;
        this.A07 = r5;
    }

    public final void Bsd(View view) {
        String displayName;
        String str;
        View view2 = view;
        ViewGroup A0J = C18220wO.A0J(view2, R.id.landing_container);
        Context context = A0J.getContext();
        if (C09650fs.A04(context)) {
            C37200JmN.A00();
            FragmentActivity fragmentActivity = this.A04;
            View inflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.button_developer_options, A0J, false);
            C63393hP.A03(inflate.getContext(), inflate.getBackground().mutate(), R.color.igds_secondary_text);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            AnonymousClass3R8.A00(fragmentActivity.getApplication());
            for (AnonymousClass3YK r12 : (Collection) C60913Rb.A02.getValue()) {
                Locale locale = Locale.ENGLISH;
                String str2 = r12.A09;
                double d = r12.A06;
                String format = String.format(locale, "%s %2.2f%%", new Object[]{str2, Double.valueOf(d * 100.0d)});
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.landing_spinner_group, (ViewGroup) null, false);
                AnonymousClass0wJ.A0L(inflate2, R.id.title).setText(format);
                AbsSpinner absSpinner = (AbsSpinner) inflate2.findViewById(R.id.spinner);
                AnonymousClass34V r5 = r12.A07;
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                AnonymousClass34U r0 = r12.A03;
                if (r0 == null) {
                    str = "groupOverrideProvider";
                } else {
                    String string = r0.A00.A00.getString(str2, (String) null);
                    List list = r5.A00;
                    int size = list.size();
                    for (int i = 0; i < list.size(); i++) {
                        A0v2.add(String.format(locale, "%s - [%2.2f%%/%2.2f%%]", new Object[]{C61163Sd.A00(list, i), Double.valueOf(((C61163Sd) list.get(i)).A00 * 100.0d), Double.valueOf(d * ((C61163Sd) list.get(i)).A00 * 100.0d)}));
                        if (C61163Sd.A00(list, i).equals(string)) {
                            size = i;
                        }
                    }
                    C61163Sd r02 = r12.A04;
                    if (r02 == null) {
                        str = "allocatedGroup";
                    } else {
                        A0v2.add(String.format((Locale) null, "No override (%s)", new Object[]{r02.A01}));
                        absSpinner.setAdapter(new ArrayAdapter(fragmentActivity, 17367043, A0v2));
                        absSpinner.setSelection(size);
                        absSpinner.setOnItemSelectedListener(new C65663u2(r5, r12, this));
                        A0v.add(inflate2);
                    }
                }
                C04220Ms.A0E(str);
                throw null;
            }
            AnonymousClass0wJ.A18(inflate, 155, SandboxUtil.getSandboxDialog(fragmentActivity, this.A06, A0v), this);
            inflate.setOnLongClickListener(new IDxCListenerShape447S0100000_1_I2(this, 4));
            A0J.addView(inflate);
        }
        TextView A0G = C18180wK.A0G(view2, R.id.language_selector_button);
        if (A0G != null) {
            C18210wN.A0y(A0G);
            FragmentActivity fragmentActivity2 = this.A04;
            if (!C121907Is.A05(fragmentActivity2, R.attr.nuxAllowLanguagePicker, true)) {
                A0G.setVisibility(8);
            } else {
                String A0h = C18200wM.A0h(C18200wM.A0C(), "fb_language_locale");
                if (!TextUtils.isEmpty(A0h)) {
                    Iterator it = C62503a9.A01.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AnonymousClass19W r1 = (AnonymousClass19W) it.next();
                        if (r1.A02.equals(A0h)) {
                            displayName = fragmentActivity2.getString(r1.A01);
                            break;
                        }
                    }
                }
                displayName = fragmentActivity2.getResources().getConfiguration().locale.getDisplayName();
                int color = fragmentActivity2.getColor(R.color.igds_secondary_text);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(displayName);
                spannableStringBuilder.append("  ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(new ImageSpan(AnonymousClass2OY.A00(fragmentActivity2, R.drawable.feed_sponsored_chevron, 8, color), 1), length - 1, length, 33);
                A0G.setText(spannableStringBuilder);
                A0G.setContentDescription(C18190wL.A0h(A0G.getResources(), A0G.getText(), 2131829323));
                AnonymousClass0wJ.A17(A0G, 31, this);
            }
        }
        this.A03 = new C24661jn(this.A06, (AnonymousClass1cQ) null, this.A07);
        C38040KHr.A01.A03(this.A08, AnonymousClass45A.class);
        this.A05.registerLifecycleListener(this.A03);
    }
}
