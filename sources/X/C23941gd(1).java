package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.redex.IDxCSpanShape14S0100000_1_I2;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.service.session.UserSession;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape60S0100000_I2_40;

/* renamed from: X.1gd  reason: invalid class name and case insensitive filesystem */
public final class C23941gd extends AnonymousClass436 {
    public boolean A00;
    public boolean A01;
    public final C62673aV A02;
    public final UserSession A03;
    public final AnonymousClass3ZL A04;
    public final long A05;
    public final C13330nS A06;
    public final C30938GbW A07;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r5, Object obj, Object obj2) {
        BKU bku = (BKU) obj;
        C04220Ms.A0B(r5, 0);
        if (bku != null && C17524ADk.A00(bku)) {
            r5.A5L(0, bku, (Object) null);
        }
    }

    public C23941gd(C13330nS r4, C30938GbW gbW, UserSession userSession) {
        this.A03 = userSession;
        this.A07 = gbW;
        this.A06 = r4;
        this.A05 = C63803iN.A03(AnonymousClass0TJ.A05, userSession, 36601466484166329L);
        this.A04 = AnonymousClass3Zu.A03(userSession);
        this.A02 = (C62673aV) userSession.A01(C62673aV.class, new KtLambdaShape60S0100000_I2_40(userSession, 39));
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        boolean A0E;
        int i2;
        int A032 = C14030oh.A03(-786695881);
        C04220Ms.A0B(view, 1);
        BKU bku = (BKU) obj;
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.igds.components.banner.IgdsBanner");
        IgdsBanner igdsBanner = (IgdsBanner) tag;
        if (bku != null && C17524ADk.A00(bku) && !this.A01) {
            UserSession userSession = this.A03;
            AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
            if (C63803iN.A0E(r2, userSession, 36319991507719732L)) {
                C62673aV r9 = this.A02;
                C313425p r10 = C313425p.A0P;
                if (r9.A03.get(r10) != null && C63803iN.A0E(r2, r9.A00, 36319991506736687L)) {
                    A0E = !C62673aV.A02(r9, C62673aV.A01(r9, r10, C62673aV.A00(r9, r10)).A00);
                }
            } else {
                long A033 = C63803iN.A03(r2, userSession, 36601466483838647L);
                if (A033 == 0 || ((long) this.A04.A02()) < A033) {
                    A0E = C63803iN.A0E(r2, userSession, 36319991506736687L);
                }
            }
            if (A0E) {
                Context A0A = C18190wL.A0A(igdsBanner);
                long A034 = C63803iN.A03(r2, userSession, 36601466484231866L);
                if (Long.valueOf(A034) != null) {
                    if (A034 != 0) {
                        if (A034 == 1) {
                            i2 = 2131838125;
                        } else if (A034 == 2) {
                            i2 = 2131838126;
                        } else if (A034 == 3) {
                            i2 = 2131838127;
                        } else if (A034 == 4) {
                            i2 = 2131838128;
                        } else if (A034 == 5) {
                            i2 = 2131838129;
                        } else if (A034 == 6) {
                            i2 = 2131838130;
                        } else if (A034 == 7) {
                            i2 = 2131838131;
                        }
                        IDxCSpanShape14S0100000_1_I2 iDxCSpanShape14S0100000_1_I2 = new IDxCSpanShape14S0100000_1_I2(this, 16);
                        String A0g = C18190wL.A0g(A0A.getResources(), 2131829574);
                        SpannableStringBuilder A0E2 = C18200wM.A0E(C18210wN.A0C(A0A.getResources(), A0g, i2));
                        AnonymousClass3Zw.A01(A0E2, iDxCSpanShape14S0100000_1_I2, A0g);
                        igdsBanner.setBody(A0E2, true);
                        igdsBanner.A00 = new AnonymousClass4Ci(igdsBanner, this);
                        igdsBanner.setDismissible(C63803iN.A0E(r2, userSession, 36319991506671150L));
                        igdsBanner.setVisibility(0);
                        C30938GbW gbW = this.A07;
                        C37021Jix A002 = C37284Jnx.A00(bku, Unit.A00, AnonymousClass00U.A0L("XarDisclosureBanner_for_", bku.A0f.A4Y));
                        A002.A01(new C25631nz(this, this.A05));
                        gbW.A03(igdsBanner, A002.A02());
                        C14030oh.A0A(1677852451, A032);
                    }
                    i2 = 2131838124;
                    IDxCSpanShape14S0100000_1_I2 iDxCSpanShape14S0100000_1_I22 = new IDxCSpanShape14S0100000_1_I2(this, 16);
                    String A0g2 = C18190wL.A0g(A0A.getResources(), 2131829574);
                    SpannableStringBuilder A0E22 = C18200wM.A0E(C18210wN.A0C(A0A.getResources(), A0g2, i2));
                    AnonymousClass3Zw.A01(A0E22, iDxCSpanShape14S0100000_1_I22, A0g2);
                    igdsBanner.setBody(A0E22, true);
                    igdsBanner.A00 = new AnonymousClass4Ci(igdsBanner, this);
                    igdsBanner.setDismissible(C63803iN.A0E(r2, userSession, 36319991506671150L));
                    igdsBanner.setVisibility(0);
                    C30938GbW gbW2 = this.A07;
                    C37021Jix A0022 = C37284Jnx.A00(bku, Unit.A00, AnonymousClass00U.A0L("XarDisclosureBanner_for_", bku.A0f.A4Y));
                    A0022.A01(new C25631nz(this, this.A05));
                    gbW2.A03(igdsBanner, A0022.A02());
                    C14030oh.A0A(1677852451, A032);
                }
                C14100oo ABJ = C10770iu.A00().ABJ("ig_xar_reels_fb_commenting: Invalid comment_sheet_banner_text_variant", 817896325);
                ABJ.A8T("variant", A034);
                ABJ.report();
                i2 = 2131838124;
                IDxCSpanShape14S0100000_1_I2 iDxCSpanShape14S0100000_1_I222 = new IDxCSpanShape14S0100000_1_I2(this, 16);
                String A0g22 = C18190wL.A0g(A0A.getResources(), 2131829574);
                SpannableStringBuilder A0E222 = C18200wM.A0E(C18210wN.A0C(A0A.getResources(), A0g22, i2));
                AnonymousClass3Zw.A01(A0E222, iDxCSpanShape14S0100000_1_I222, A0g22);
                igdsBanner.setBody(A0E222, true);
                igdsBanner.A00 = new AnonymousClass4Ci(igdsBanner, this);
                igdsBanner.setDismissible(C63803iN.A0E(r2, userSession, 36319991506671150L));
                igdsBanner.setVisibility(0);
                C30938GbW gbW22 = this.A07;
                C37021Jix A00222 = C37284Jnx.A00(bku, Unit.A00, AnonymousClass00U.A0L("XarDisclosureBanner_for_", bku.A0f.A4Y));
                A00222.A01(new C25631nz(this, this.A05));
                gbW22.A03(igdsBanner, A00222.A02());
                C14030oh.A0A(1677852451, A032);
            }
        }
        igdsBanner.A00 = null;
        igdsBanner.setVisibility(8);
        C14030oh.A0A(1677852451, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(10986317, viewGroup);
        Context context = viewGroup.getContext();
        IgFrameLayout igFrameLayout = new IgFrameLayout(context);
        igFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C04220Ms.A06(context);
        IgdsBanner igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
        igdsBanner.setVisibility(8);
        igFrameLayout.addView(igdsBanner);
        igFrameLayout.setTag(igdsBanner);
        C14030oh.A0A(-671682865, A002);
        return igFrameLayout;
    }
}
