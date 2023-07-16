package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxCCallbackShape483S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import fxcache.model.FxCalAccount;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;

/* renamed from: X.1Z1  reason: invalid class name */
public final class AnonymousClass1Z1 extends C34640IcN implements CallerContextable {
    public static final String __redex_internal_original_name = "QuickCaptureAddToStoryDualDestinationFragment";
    public ImageView A00;
    public ImageView A01;
    public AnonymousClass341 A02;
    public boolean A03;
    public boolean A04;
    public C39769Kzd A05;

    public final String getModuleName() {
        return "quick_capture_add_to_story_dual_destination_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        TextView textView;
        String str;
        String str2;
        String str3;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (ImageView) AnonymousClass0wJ.A0J(view, R.id.my_story_avatar);
        AnonymousClass0wJ.A17(AnonymousClass0wJ.A0K(view, R.id.action_button), 285, this);
        AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
        UserSession A0W = C18180wK.A0W(this, r2);
        AnonymousClass0TJ r7 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r7, A0W, 36324819049915075L)) {
            C18200wM.A17(AnonymousClass0wJ.A0B(this), (TextView) AnonymousClass0wJ.A0J(view, R.id.header_text), 2131821148);
        }
        View A0J = AnonymousClass0wJ.A0J(view, R.id.your_facebook_story_row);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view, R.id.add_to_story_dual_destination_share_sheet_fb_story_row_subtitle);
        this.A01 = (ImageView) AnonymousClass0wJ.A0J(view, R.id.share_to_fb_check);
        A01(this);
        if (this.A03) {
            if (C63803iN.A0E(r7, C18180wK.A0W(this, r2), 36324819049915075L)) {
                boolean A0D = C67373zR.A0D(C18180wK.A0W(this, r2));
                View A0J2 = AnonymousClass0wJ.A0J(view, R.id.fb_profile_avatar);
                if (A0D) {
                    GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) A0J2;
                    TextView textView3 = (TextView) AnonymousClass0wJ.A0J(view, R.id.add_to_story_dual_destination_share_sheet_fb_story_row_subtitle);
                    if (C60343Oq.A01(C18180wK.A0W(this, r2))) {
                        str2 = C67373zR.A01(C18180wK.A0W(this, r2));
                    } else {
                        C04620Ok r1 = C06810aP.A01;
                        if (C18200wM.A1X(C18180wK.A0W(this, r2), r1)) {
                            str2 = r1.A01(C18180wK.A0W(this, r2)).A18();
                        } else if (C67363zQ.A0H(C18180wK.A0W(this, r2))) {
                            str2 = C67363zQ.A01(C18180wK.A0W(this, r2)).A02;
                        } else {
                            FxCalAccount A012 = C35692Ol.A00(C18180wK.A0W(this, r2)).A01(CallerContext.A00(AnonymousClass1Z1.class), "ig_android_sdk_token_cache_ig_to_fb_story_crossposting");
                            if (A012 != null) {
                                str2 = A012.A04;
                            } else {
                                str2 = null;
                            }
                        }
                    }
                    Context context = getContext();
                    String str4 = null;
                    if (context != null) {
                        str3 = context.getString(2131824664);
                    } else {
                        str3 = null;
                    }
                    UserSession A0W2 = C18180wK.A0W(this, r2);
                    C04220Ms.A0B(A0W2, 0);
                    String A002 = ((C67053yn) A0W2.A01(C67053yn.class, new KtLambdaShape116S0100000_I2_96(A0W2, 20))).A00(str2);
                    if (A002 == null || !C63803iN.A0E(r7, C18180wK.A0W(this, r2), 36327915721337054L)) {
                        gradientSpinnerAvatarView.setVisibility(8);
                    } else {
                        AnonymousClass0wJ.A0K(view, R.id.fb_icon).setVisibility(8);
                        gradientSpinnerAvatarView.A04();
                        A02(this, gradientSpinnerAvatarView, A002);
                    }
                    i = 0;
                    if (C63803iN.A0E(r7, C18180wK.A0W(this, r2), 36327421800163338L)) {
                        Context context2 = getContext();
                        if (context2 != null) {
                            str4 = C18220wO.A0h(context2, str2, str3, 2131821145);
                        }
                    } else {
                        str4 = str2;
                    }
                    textView3.setText(str4);
                    textView = textView3;
                } else {
                    GradientSpinnerAvatarView gradientSpinnerAvatarView2 = (GradientSpinnerAvatarView) A0J2;
                    View A0J3 = AnonymousClass0wJ.A0J(view, R.id.fb_icon);
                    TextView textView4 = (TextView) AnonymousClass0wJ.A0J(view, R.id.add_to_story_dual_destination_share_sheet_fb_story_row_subtitle);
                    FxCalAccount A013 = C35692Ol.A00(C18180wK.A0W(this, r2)).A01(CallerContext.A00(AnonymousClass1Z1.class), "ig_android_sdk_token_cache_ig_to_fb_story_crossposting");
                    String str5 = null;
                    if (A013 != null) {
                        str = A013.A06;
                    } else {
                        str = null;
                    }
                    i = 8;
                    if (str != null) {
                        String str6 = A013.A04;
                        String A003 = AnonymousClass2ML.A00(getContext(), AnonymousClass2MK.A00(C18180wK.A0W(this, r2)).A00, AnonymousClass2MK.A00(C18180wK.A0W(this, r2)).A01);
                        A0J3.setVisibility(8);
                        textView4.setVisibility(0);
                        if (A003 == null || !C63803iN.A0E(r7, C18180wK.A0W(this, r2), 36327421800163338L)) {
                            str5 = str6;
                        } else {
                            Context context3 = getContext();
                            if (context3 != null) {
                                str5 = C18220wO.A0h(context3, str6, A003, 2131821145);
                            }
                        }
                        textView4.setText(str5);
                        gradientSpinnerAvatarView2.A04();
                        A02(this, gradientSpinnerAvatarView2, A013.A06);
                        AnonymousClass0wJ.A17(A0J, 284, this);
                        A00(C318329d.VIEW, this, this.A04);
                    } else {
                        A0J3.setVisibility(0);
                        textView = gradientSpinnerAvatarView2;
                    }
                }
            } else {
                i = 8;
                textView = AnonymousClass0wJ.A0J(view, R.id.fb_profile_avatar);
            }
            textView.setVisibility(i);
            AnonymousClass0wJ.A17(A0J, 284, this);
            A00(C318329d.VIEW, this, this.A04);
        } else {
            A0J.setAlpha(0.5f);
            textView2.setVisibility(0);
            textView2.setText(2131821146);
            A00(C318329d.UNAVAILABLE, this, false);
            AnonymousClass0wJ.A0K(view, R.id.fb_profile_avatar).setVisibility(8);
        }
        this.A05 = new IDxCCallbackShape483S0100000_1_I2(this, 1);
        C37030Jj7 A0A = C37744K2e.A01().A0A(C06810aP.A01.A01(C18180wK.A0W(this, r2)).B4M(), (String) null);
        A0A.A02(this.A05);
        A0A.A01();
    }

    public static final void A00(C318329d r4, AnonymousClass1Z1 r5, boolean z) {
        AnonymousClass14I r3 = new AnonymousClass14I();
        r3.A07("is_xpost_enabled", Boolean.valueOf(z));
        UserSession A0W = C18180wK.A0W(r5, AnonymousClass0RA.A0C);
        C49212r1.A00(r4, AnonymousClass293.STORY, AnonymousClass2AC.A0S, r3, A0W);
    }

    public static final void A01(AnonymousClass1Z1 r4) {
        ImageView imageView;
        Context requireContext;
        int i;
        if (!r4.A03) {
            ImageView imageView2 = r4.A01;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
        } else {
            boolean z = r4.A04;
            ImageView imageView3 = r4.A01;
            if (z) {
                if (imageView3 != null) {
                    C18180wK.A0r(r4.requireContext(), imageView3, R.drawable.instagram_circle_check_pano_filled_24);
                    imageView = r4.A01;
                    if (imageView != null) {
                        requireContext = r4.requireContext();
                        i = R.color.blue_5;
                    }
                }
            } else if (imageView3 != null) {
                C18180wK.A0r(r4.requireContext(), imageView3, R.drawable.instagram_circle_outline_24);
                imageView = r4.A01;
                if (imageView != null) {
                    requireContext = r4.requireContext();
                    i = R.color.grey_2;
                }
            }
            C18240wQ.A0r(requireContext, imageView, i);
            return;
        }
        C04220Ms.A0E("shareToFacebookCheck");
        throw null;
    }

    public static void A02(AnonymousClass1Z1 r2, GradientSpinnerAvatarView gradientSpinnerAvatarView, String str) {
        gradientSpinnerAvatarView.A09(new SimpleImageUrl(str), r2);
        gradientSpinnerAvatarView.setBottomBadgeDrawable(r2.requireContext().getDrawable(R.drawable.avatar_bottom_badge));
        gradientSpinnerAvatarView.A01 = C09860go.A03(r2.getContext(), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return C18180wK.A0W(this, AnonymousClass0RA.A0C);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(-973631129);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Boolean bool = null;
        if (bundle2 != null) {
            bool = C18210wN.A0Q(bundle2, "is_sharing_to_fb");
        }
        if (bool != null) {
            this.A04 = bool.booleanValue();
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                boolean z = bundle3.getBoolean("can_share_to_fb");
                if (Boolean.valueOf(z) != null) {
                    this.A03 = z;
                    C14030oh.A09(133186714, A022);
                    return;
                }
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 1527373469;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 980792819;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1996233163);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_add_to_story_dual_destination, viewGroup, false);
        C14030oh.A09(-217746698, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-860741814);
        super.onDestroy();
        this.A02 = null;
        C14030oh.A09(-932907829, A022);
    }
}
