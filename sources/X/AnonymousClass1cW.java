package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.Map;

/* renamed from: X.1cW  reason: invalid class name */
public final class AnonymousClass1cW extends C34640IcN implements C82424pb, C27987Ewb, C82034oy, C84264sr {
    public static final String __redex_internal_original_name = "OptInEmailFragment";
    public BusinessFlowAnalyticsLogger A00;
    public String A01;
    public boolean A02;
    public boolean A03 = true;
    public C84654td A04;
    public C24711ju A05;
    public IgdsListCell A06;
    public String A07;
    public boolean A08 = true;
    public boolean A09;
    public final C04530Oa A0A = C80644m9.A00(this);

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final /* synthetic */ void C9s(int i, int i2) {
    }

    public final /* synthetic */ void CA4(int i, int i2, boolean z) {
    }

    public final /* synthetic */ void CIi(C23881Czs czs, float f, float f2) {
    }

    public final /* synthetic */ void CIn(C23881Czs czs, C23881Czs czs2) {
    }

    public final void CJ9() {
    }

    public final /* synthetic */ void COK(int i, int i2) {
    }

    public final /* synthetic */ void CSd(int i, float f) {
    }

    public final /* synthetic */ void CUX(View view) {
    }

    public final String getModuleName() {
        return "opt_in_email_fragment";
    }

    public final void onAttach(Context context) {
        C04220Ms.A0B(context, 0);
        super.onAttach(context);
        C84654td A012 = C67293zJ.A01(this);
        if (A012 != null) {
            this.A04 = A012;
            return;
        }
        throw C18180wK.A0a("controller must not be null");
    }

    public final void CCX() {
        String str;
        String str2;
        String str3;
        boolean z = this.A03;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        if (z != this.A02) {
            Context requireContext = requireContext();
            AnonymousClass06E A002 = AnonymousClass06E.A00(this);
            C32165H8c A012 = AnonymousClass3OP.A01(AnonymousClass0wJ.A0X(this.A0A), "marketing_email", str);
            C63873iU.A0E(A012, this, 18);
            C31155GhB.A01(requireContext, A002, A012);
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            str3 = "logger";
        } else {
            String str4 = this.A01;
            if (this.A03) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            businessFlowAnalyticsLogger.BcE(new C37408JrQ("opt_in_promotional_email", str4, (String) null, (String) null, (String) null, (Map) null, C63203gz.A03("opt_in_promotional_email_setting", str2), (Map) null));
            C84654td r0 = this.A04;
            if (r0 == null) {
                str3 = "controller";
            } else {
                ((BusinessConversionActivity) r0).Bel((Bundle) null);
                return;
            }
        }
        C04220Ms.A0E(str3);
        throw null;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            r3.setTitle("");
            AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 159);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0A);
    }

    public final boolean onBackPressed() {
        C84654td r0 = this.A04;
        if (r0 == null) {
            C04220Ms.A0E("controller");
            throw null;
        }
        C18230wP.A1Q(r0);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(2051079325);
        super.onCreate(bundle);
        String string = requireArguments().getString("user_email");
        if (string == null) {
            string = "";
        }
        this.A07 = string;
        this.A09 = requireArguments().getBoolean("is_creator");
        this.A01 = C18190wL.A0k(this);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A0A);
        C84654td r0 = this.A04;
        if (r0 != null) {
            C311924p Aiz = r0.Aiz();
            C84654td r02 = this.A04;
            if (r02 != null) {
                BusinessFlowAnalyticsLogger A0O = C18190wL.A0O(Aiz, this, A0U, r02);
                if (A0O != null) {
                    this.A00 = A0O;
                    C14030oh.A09(-649256929, A022);
                    return;
                }
                IllegalStateException A0a = C18180wK.A0a("received null flowType or unexpected value for flowType");
                C14030oh.A09(1283562733, A022);
                throw A0a;
            }
        }
        C04220Ms.A0E("controller");
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(853071034);
        C04220Ms.A0B(layoutInflater, 0);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            str = "logger";
        } else {
            businessFlowAnalyticsLogger.Bdt(new C37408JrQ("opt_in_promotional_email", this.A01, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            View inflate = layoutInflater.inflate(R.layout.opt_in_email_fragment, viewGroup, false);
            boolean z = this.A09;
            IgdsHeadline A0S = C18240wQ.A0S(inflate, R.id.opt_in_email_headline);
            int i = 2131832031;
            if (z) {
                i = 2131832032;
            }
            A0S.setHeadline(i);
            IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass0wJ.A0J(inflate, R.id.opt_in_email_footer);
            Resources A0B = AnonymousClass0wJ.A0B(this);
            String str2 = this.A07;
            if (str2 == null) {
                str = "userEmail";
            } else {
                Spanned A012 = C16370sw.A01(A0B, new String[]{str2}, 2131832028);
                C04220Ms.A06(A012);
                igdsListCell.A0H(A012);
                igdsListCell.A07(R.style.PrivacyTextStyle);
                IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass0wJ.A0J(inflate, R.id.promotional_emails_cell);
                this.A06 = igdsListCell2;
                str = "promotionalEmailsCell";
                if (igdsListCell2 != null) {
                    igdsListCell2.setTextCellType(AnonymousClass24V.TYPE_SWITCH);
                    IgdsListCell igdsListCell3 = this.A06;
                    if (igdsListCell3 != null) {
                        igdsListCell3.A0H(C18180wK.A0g(this, 2131832030));
                        IgdsListCell igdsListCell4 = this.A06;
                        if (igdsListCell4 != null) {
                            igdsListCell4.A0G(C18180wK.A0g(this, 2131832029));
                            IgdsListCell igdsListCell5 = this.A06;
                            if (igdsListCell5 != null) {
                                igdsListCell5.setChecked(this.A03);
                                IgdsListCell igdsListCell6 = this.A06;
                                if (igdsListCell6 != null) {
                                    C18230wP.A1N(igdsListCell6, this, 6);
                                    C24711ju r0 = new C24711ju((C84264sr) this, C18230wP.A0W(inflate, R.id.navigation_bar), 2131831737, -1);
                                    this.A05 = r0;
                                    registerLifecycleListener(r0);
                                    C14030oh.A09(1001939426, A022);
                                    return inflate;
                                }
                            }
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1726428495);
        super.onDestroyView();
        C24711ju r0 = this.A05;
        if (r0 == null) {
            C04220Ms.A0E("businessNavBarHelper");
            throw null;
        }
        unregisterLifecycleListener(r0);
        C14030oh.A09(-1671237825, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-1056664046);
        super.onStart();
        boolean z = this.A08;
        this.A03 = z;
        IgdsListCell igdsListCell = this.A06;
        if (igdsListCell == null) {
            C04220Ms.A0E("promotionalEmailsCell");
            throw null;
        }
        igdsListCell.setChecked(z);
        C14030oh.A09(1529797724, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-259517626);
        this.A08 = this.A03;
        super.onStop();
        C14030oh.A09(-1310423571, A022);
    }
}
