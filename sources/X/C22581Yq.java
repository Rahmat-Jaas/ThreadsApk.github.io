package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.IDxPCallbackShape32S0100000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15;

/* renamed from: X.1Yq  reason: invalid class name and case insensitive filesystem */
public final class C22581Yq extends C34640IcN {
    public static final String __redex_internal_original_name = "ShareProfileFragment";
    public AnonymousClass4Aj A00;
    public UserSession A01;
    public User A02;
    public Integer A03 = AnonymousClass006.A00;
    public Integer A04;
    public boolean A05;
    public IgTextView A06;
    public CircularImageView A07;
    public CircularImageView A08;
    public final int[] A09 = {-160462, -3078039};

    public final String getModuleName() {
        return "lightweight_connections_share_profile";
    }

    public final void onAttach(Context context) {
        C04220Ms.A0B(context, 0);
        super.onAttach(context);
        AnonymousClass00F r3 = requireActivity().mOnBackPressedDispatcher;
        C04220Ms.A06(r3);
        IDxPCallbackShape32S0100000_I2 iDxPCallbackShape32S0100000_I2 = new IDxPCallbackShape32S0100000_I2((AnonymousClass0YY) new KtLambdaShape160S0100000_I2_15(this, 47));
        r3.A05(iDxPCallbackShape32S0100000_I2, this);
        iDxPCallbackShape32S0100000_I2.A02(true);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.x_button);
        AnonymousClass0wJ.A17(requireViewById, 23, this);
        C04220Ms.A06(requireViewById);
        AnonymousClass0wJ.A17(view.requireViewById(R.id.share_button), 20, this);
        IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.skip_button);
        AnonymousClass0wJ.A17(igTextView, 21, this);
        this.A06 = igTextView;
        Integer num = this.A04;
        if (num == null) {
            str = "navControlVariant";
        } else {
            str = "skipButton";
            if (num == AnonymousClass006.A01) {
                requireViewById.setVisibility(0);
                IgTextView igTextView2 = this.A06;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(8);
                }
            } else {
                requireViewById.setVisibility(8);
                IgTextView igTextView3 = this.A06;
                if (igTextView3 != null) {
                    igTextView3.setVisibility(0);
                }
            }
            TextView A0L = AnonymousClass0wJ.A0L(view, R.id.profile_username);
            A0L.setTypeface(C09250f7.A05.A00(requireContext()).A03(C09340fG.A0M));
            A0L.setAllCaps(true);
            C04620Ok r1 = C06810aP.A01;
            UserSession userSession = this.A01;
            if (userSession != null) {
                A0L.setText(C18200wM.A0k(userSession, r1));
                A0L.measure(0, 0);
                TextPaint paint = A0L.getPaint();
                float measuredHeight = (float) A0L.getMeasuredHeight();
                float measuredWidth = (float) A0L.getMeasuredWidth();
                int[] iArr = this.A09;
                paint.setShader(new RadialGradient(((float) A0L.getMeasuredWidth()) / 2.0f, measuredHeight, measuredWidth, iArr[0], iArr[1], Shader.TileMode.CLAMP));
                TextView A0L2 = AnonymousClass0wJ.A0L(view, R.id.profile_name);
                User user = this.A02;
                if (user == null) {
                    str = "user";
                } else {
                    A0L2.setText(user.Ak1());
                    CircularImageView circularImageView = (CircularImageView) AnonymousClass0wJ.A0J(view, R.id.profile_avatar_image);
                    circularImageView.measure(0, 0);
                    AnonymousClass0wJ.A17(circularImageView, 22, this);
                    this.A07 = circularImageView;
                    CircularImageView circularImageView2 = (CircularImageView) AnonymousClass0wJ.A0J(view, R.id.plus_badge);
                    circularImageView2.measure(0, 0);
                    CircularImageView circularImageView3 = this.A07;
                    str = "avatarImageView";
                    if (circularImageView3 != null) {
                        double measuredWidth2 = (double) (circularImageView3.getMeasuredWidth() >> 1);
                        CircularImageView circularImageView4 = this.A07;
                        if (circularImageView4 != null) {
                            int sqrt = (int) ((measuredWidth2 - Math.sqrt(((double) circularImageView4.getMeasuredWidth()) / 2.0d)) + ((double) (circularImageView2.getMeasuredWidth() >> 1)));
                            ViewGroup.LayoutParams layoutParams = circularImageView2.getLayoutParams();
                            C04220Ms.A0C(layoutParams, I17.A00(284));
                            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, sqrt, sqrt);
                            circularImageView2.setLayoutParams(layoutParams2);
                            circularImageView2.setColorFilter(new PorterDuffColorFilter(circularImageView2.getResources().getColor(R.color.igds_facebook_blue), PorterDuff.Mode.SRC_IN));
                            this.A08 = circularImageView2;
                            A00(this);
                            UserSession userSession2 = this.A01;
                            if (userSession2 != null) {
                                AnonymousClass3YT.A00(userSession2, (AnonymousClass3V1) null, (C313625r) null, (Integer) null, "lightweight_connections", (String) null);
                                return;
                            }
                            C18250wR.A0l();
                        }
                    }
                }
            } else {
                C18250wR.A0l();
            }
            throw null;
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A00(C22581Yq r4) {
        int i;
        User user = r4.A02;
        String str = "user";
        if (user != null) {
            boolean A34 = user.A34();
            CircularImageView circularImageView = r4.A08;
            if (A34) {
                if (circularImageView != null) {
                    i = 0;
                }
                C04220Ms.A0E("plusBadge");
                throw null;
            }
            if (circularImageView != null) {
                i = 8;
            }
            C04220Ms.A0E("plusBadge");
            throw null;
            circularImageView.setVisibility(i);
            CircularImageView circularImageView2 = r4.A07;
            if (circularImageView2 == null) {
                str = "avatarImageView";
            } else {
                User user2 = r4.A02;
                if (user2 != null) {
                    C18220wO.A1L(r4, circularImageView2, user2);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        C18250wR.A0l();
        throw null;
    }

    public final void afterOnPause() {
        super.afterOnPause();
        getRootActivity();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        AnonymousClass4Aj r3 = this.A00;
        if (r3 == null) {
            str = "updateAvatarHelper";
        } else {
            r3.A09(intent, i, i2, AnonymousClass0wJ.A1T(i, 7384567));
            if (i == 7384567) {
                if (!this.A05) {
                    IgTextView igTextView = this.A06;
                    if (igTextView == null) {
                        str = "skipButton";
                    } else {
                        C18180wK.A10(igTextView, this, 2131831737);
                        this.A05 = true;
                        return;
                    }
                } else {
                    return;
                }
            } else if (i2 == -1 && intent != null && intent.getExtras() != null) {
                UserSession userSession = this.A01;
                if (userSession != null) {
                    Integer num = this.A03;
                    C04220Ms.A0B(num, 2);
                    C54172z1.A00(userSession, AnonymousClass006.A0j, num);
                    return;
                }
                C18250wR.A0l();
                throw null;
            } else {
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = 453756890(0x1b0bc7da, float:1.1562386E-22)
            int r4 = X.C14030oh.A02(r0)
            r6 = r12
            super.onCreate(r13)
            X.0RG r0 = X.AnonymousClass0RA.A0C
            com.instagram.service.session.UserSession r1 = X.C18180wK.A0W(r12, r0)
            r12.A01 = r1
            X.0Ok r0 = X.C06810aP.A01
            if (r1 == 0) goto L_0x0093
            com.instagram.user.model.User r0 = r0.A01(r1)
            r12.A02 = r0
            android.os.Bundle r1 = r12.mArguments
            if (r1 == 0) goto L_0x006b
            java.lang.String r0 = "ShareProfileFragment.NavControlVariant"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x006b
            java.lang.String r0 = "NUX"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x0033:
            r12.A04 = r0
            com.instagram.service.session.UserSession r9 = r12.A01
            if (r9 == 0) goto L_0x008e
            X.0m7 r7 = X.C18250wR.A0B(r12)
            com.instagram.user.model.User r10 = r12.A02
            if (r10 != 0) goto L_0x0048
            java.lang.String r0 = "user"
        L_0x0043:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0048:
            r0 = 0
            com.facebook.redex.IDxCDelegateShape871S0100000_1_I2 r8 = new com.facebook.redex.IDxCDelegateShape871S0100000_1_I2
            r8.<init>(r12, r0)
            java.lang.Integer r11 = X.AnonymousClass006.A0s
            X.4Aj r5 = new X.4Aj
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.A00 = r5
            java.lang.Integer r0 = r12.A04
            if (r0 != 0) goto L_0x006e
            java.lang.String r0 = "navControlVariant"
            goto L_0x0043
        L_0x005e:
            java.lang.String r0 = "TOOLBAR"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x006b
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r1)
            throw r0
        L_0x006b:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x0033
        L_0x006e:
            java.lang.Integer r3 = X.AnonymousClass006.A00
            r2 = r3
            if (r0 == r3) goto L_0x0075
            java.lang.Integer r3 = X.AnonymousClass006.A01
        L_0x0075:
            r12.A03 = r3
            com.instagram.service.session.UserSession r1 = r12.A01
            if (r1 == 0) goto L_0x0089
            r0 = 2
            X.C04220Ms.A0B(r3, r0)
            X.C54172z1.A00(r1, r2, r3)
            r0 = 17695981(0x10e04ed, float:2.6084815E-38)
            X.C14030oh.A09(r0, r4)
            return
        L_0x0089:
            X.C18250wR.A0l()
            r0 = 0
            throw r0
        L_0x008e:
            X.C18250wR.A0l()
            r0 = 0
            throw r0
        L_0x0093:
            X.C18250wR.A0l()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22581Yq.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-269457496);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.nux_share_profile, false);
        C14030oh.A09(-1988457642, A022);
        return A0D;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-2125018114);
        super.onResume();
        getRootActivity();
        C14030oh.A09(-589684959, A022);
    }
}
