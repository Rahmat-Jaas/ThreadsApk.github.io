package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.IDxPCallbackShape32S0100000_I2;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxBDelegateShape506S0100000_1_I2;
import com.facebook.redex.IDxCBackShape840S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95;
import kotlin.jvm.internal.KtLambdaShape163S0100000_I2_18;
import kotlin.jvm.internal.KtLambdaShape33S0200000_I2_17;

/* renamed from: X.1Yx  reason: invalid class name and case insensitive filesystem */
public final class C22651Yx extends C34640IcN {
    public static final String __redex_internal_original_name = "BirthdayEffectsSettingsFragment";
    public Bitmap A00;
    public Uri A01;
    public E2V A02;
    public AnonymousClass433 A03;
    public CircularImageView A04;
    public CircularImageView A05;
    public IgdsBottomButtonLayout A06;
    public AnonymousClass111 A07;
    public AnonymousClass3F7 A08;
    public C58133Eb A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public RecyclerView A0E;
    public IgSimpleImageView A0F;
    public IgSimpleImageView A0G;
    public CircularImageView A0H;
    public CircularImageView A0I;
    public CircularImageView A0J;
    public CircularImageView A0K;
    public AnonymousClass3TR A0L;
    public C18330wh A0M;
    public final C04530Oa A0N = C80644m9.A00(this);
    public final C04530Oa A0O;

    public final String getModuleName() {
        return "birthday_effects_visibility_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        getRootActivity();
        E2V e2v = new E2V(C18210wN.A0H(this, 230), C18220wO.A0J(requireView(), R.id.birthday_effects_settings_action_bar));
        this.A02 = e2v;
        e2v.A0S(new IDxBDelegateShape506S0100000_1_I2(this, 4));
        C18190wL.A1C(getViewLifecycleOwner(), ((C19440zs) this.A0O.getValue()).A01, this, 45);
        CircularImageView circularImageView = this.A04;
        String str = "profilePicImageView";
        if (circularImageView != null) {
            C18220wO.A1L(this, circularImageView, C06810aP.A01.A01(AnonymousClass0wJ.A0X(this.A0N)));
            A06(this, true);
            CircularImageView circularImageView2 = this.A04;
            if (circularImageView2 != null) {
                AnonymousClass0wJ.A17(circularImageView2, 228, this);
                CircularImageView circularImageView3 = this.A05;
                if (circularImageView3 == null) {
                    str = "selfieCameraImageView";
                } else {
                    AnonymousClass0wJ.A17(circularImageView3, 229, this);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A06;
                    str = "bottomButtonsView";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setPrimaryActionOnClickListener(C18210wN.A0H(this, 226));
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A06;
                        if (igdsBottomButtonLayout2 != null) {
                            igdsBottomButtonLayout2.setSecondaryActionOnClickListener(C18210wN.A0H(this, 227));
                            return;
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A01(C22651Yx r3) {
        AnonymousClass3TR r2 = r3.A0L;
        if (r2 != null) {
            C38040KHr.A01.CWx(new E5S(r2));
            r3.A0L = null;
        }
    }

    public static final void A02(C22651Yx r1) {
        C18330wh r0 = r1.A0M;
        if (r0 != null) {
            r0.dismiss();
        }
        r1.A0M = null;
    }

    public static final void A04(C22651Yx r4, String str, int i) {
        C10300i6 A0U = AnonymousClass0wJ.A0U(r4.A0N);
        Integer valueOf = Integer.valueOf(i);
        C04220Ms.A0B(A0U, 0);
        H1T A0P = C18180wK.A0P(A0U);
        C18190wL.A1P(A0P, "users/", "set_birthday_opt_in_settings/");
        A0P.A0B(C21331Qh.class, AnonymousClass3JZ.class);
        if (valueOf != null) {
            A0P.A0K("visibility_status", valueOf.intValue());
        }
        A0P.A0R("effects_enabled", true);
        if (str != null) {
            A0P.A0O("birthday_selfie_upload_id", str);
        }
        C32165H8c A022 = A0P.A02();
        C04220Ms.A0C(A022, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayOptInSettingsUpdateResponse>>");
        A022.A00 = new C24271hn(r4, str, i);
        r4.schedule(A022);
    }

    public static final void A06(C22651Yx r7, boolean z) {
        CircularImageView circularImageView;
        IgSimpleImageView igSimpleImageView = r7.A0F;
        if (z) {
            if (igSimpleImageView != null) {
                igSimpleImageView.setVisibility(0);
                CircularImageView circularImageView2 = r7.A0I;
                if (circularImageView2 != null) {
                    circularImageView2.setVisibility(0);
                    CircularImageView circularImageView3 = r7.A0H;
                    if (circularImageView3 != null) {
                        circularImageView3.setVisibility(0);
                    }
                    IgSimpleImageView igSimpleImageView2 = r7.A0G;
                    if (igSimpleImageView2 != null) {
                        igSimpleImageView2.setVisibility(8);
                        CircularImageView circularImageView4 = r7.A0J;
                        if (circularImageView4 != null) {
                            circularImageView4.setVisibility(8);
                            CircularImageView circularImageView5 = r7.A0K;
                            if (circularImageView5 != null) {
                                circularImageView5.setVisibility(8);
                            }
                            r7.A0D = false;
                            circularImageView = r7.A0H;
                        }
                        C04220Ms.A0E("selfieCameraImageViewOverlay");
                        throw null;
                    }
                    C04220Ms.A0E("selfieImageviewSelectCheckMark");
                    throw null;
                }
                C04220Ms.A0E("profilePicImageViewOverlay");
                throw null;
            }
            C04220Ms.A0E("profilePicImageviewSelectCheckMark");
            throw null;
        }
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(8);
            CircularImageView circularImageView6 = r7.A0I;
            if (circularImageView6 != null) {
                circularImageView6.setVisibility(8);
                CircularImageView circularImageView7 = r7.A0H;
                if (circularImageView7 != null) {
                    circularImageView7.setVisibility(8);
                }
                IgSimpleImageView igSimpleImageView3 = r7.A0G;
                if (igSimpleImageView3 != null) {
                    igSimpleImageView3.setVisibility(0);
                    CircularImageView circularImageView8 = r7.A0J;
                    if (circularImageView8 != null) {
                        circularImageView8.setVisibility(0);
                        CircularImageView circularImageView9 = r7.A0K;
                        if (circularImageView9 != null) {
                            circularImageView9.setVisibility(0);
                        }
                        r7.A0D = true;
                        circularImageView = r7.A0K;
                    }
                    C04220Ms.A0E("selfieCameraImageViewOverlay");
                    throw null;
                }
                C04220Ms.A0E("selfieImageviewSelectCheckMark");
                throw null;
            }
            C04220Ms.A0E("profilePicImageViewOverlay");
            throw null;
        }
        C04220Ms.A0E("profilePicImageviewSelectCheckMark");
        throw null;
        if (circularImageView != null) {
            C25702DqQ.A02(circularImageView.getDrawable());
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0N);
    }

    public C22651Yx() {
        KtLambdaShape115S0100000_I2_95 ktLambdaShape115S0100000_I2_95 = new KtLambdaShape115S0100000_I2_95(this, 35);
        C04530Oa A0l = C18240wQ.A0l(AnonymousClass006.A0C, new KtLambdaShape115S0100000_I2_95(this, 32), 33);
        this.A0O = C18220wO.A0M(new KtLambdaShape115S0100000_I2_95(A0l, 34), ktLambdaShape115S0100000_I2_95, new KtLambdaShape33S0200000_I2_17(48, (Object) null, A0l), C18210wN.A0l(C19440zs.class));
    }

    public static final void A00(C22651Yx r3) {
        A03(r3);
        C10300i6 A0U = AnonymousClass0wJ.A0U(r3.A0N);
        C04220Ms.A0B(A0U, 0);
        H1T A0P = C18180wK.A0P(A0U);
        AnonymousClass0wJ.A1J(A0P, "users/", "get_birthday_visibility_setting/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, C21341Qi.class, C58993Ja.class);
        C04220Ms.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayVisibilitySettingResponse>>");
        C63873iU.A0C(r3, A0T, 146);
    }

    public static final void A03(C22651Yx r2) {
        C18330wh A012 = C18330wh.A01(r2);
        C18330wh.A03(r2, A012, 2131830080);
        A012.setCancelable(false);
        C13950oZ.A00(A012);
        r2.A0M = A012;
    }

    public static final void A05(C22651Yx r4, AnonymousClass0ZU r5) {
        Context context = r4.getContext();
        if (context != null) {
            A01(r4);
            IDxCBackShape840S0100000_1_I2 iDxCBackShape840S0100000_1_I2 = new IDxCBackShape840S0100000_1_I2(r5, 0);
            C63733iD A022 = C63733iD.A02();
            int i = 2131831756;
            if (AnonymousClass0fS.A0A(context)) {
                i = 2131836068;
            }
            C63733iD.A08(r4, A022, i);
            A022.A01 = -1;
            A022.A0D = C18180wK.A0g(r4, 2131834950);
            A022.A0I = true;
            r4.A0L = C63733iD.A04(A022, iDxCBackShape840S0100000_1_I2, 8);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        ContentResolver contentResolver;
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i == 7766) {
            if (i2 != -1) {
                z = !this.A0D;
            } else if (intent != null && intent.getData() != null) {
                C58133Eb r3 = this.A09;
                if (r3 == null) {
                    C04220Ms.A0E("birthdayLogger");
                    throw null;
                }
                C04530Oa r1 = this.A0N;
                long A0B2 = C18200wM.A0B(AnonymousClass0wJ.A0X(r1));
                long A0B3 = C18200wM.A0B(AnonymousClass0wJ.A0X(r1));
                if (this.A00 == null || !this.A0C) {
                    str = "take";
                } else {
                    str = "retake";
                }
                r3.A00("qp", "birthday_selfie_camera", str, A0B2, A0B3);
                Context context = getContext();
                if (context != null) {
                    contentResolver = context.getContentResolver();
                } else {
                    contentResolver = null;
                }
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, intent.getData());
                C04220Ms.A06(bitmap);
                this.A00 = bitmap;
                CircularImageView circularImageView = this.A05;
                if (circularImageView == null) {
                    C04220Ms.A0E("selfieCameraImageView");
                    throw null;
                }
                circularImageView.setImageBitmap(bitmap);
                this.A0C = true;
                z = false;
            } else {
                return;
            }
            A06(this, z);
        } else if (i == 2002) {
            List list = this.A0A;
            String str2 = "audiences";
            if (list != null) {
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (((AnonymousClass3CU) it.next()).A03 == AnonymousClass250.CLOSE_FRIENDS) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                List list2 = this.A0A;
                if (list2 != null) {
                    AnonymousClass3CU r12 = (AnonymousClass3CU) list2.get(i3);
                    AnonymousClass3F7 r0 = this.A08;
                    if (r0 == null) {
                        str2 = "settingsUtils";
                    } else {
                        r12.A00 = r0.A00();
                        AnonymousClass111 r02 = this.A07;
                        if (r02 == null) {
                            str2 = "audienceAdapter";
                        } else {
                            r02.notifyItemChanged(i3);
                            return;
                        }
                    }
                }
            }
            C04220Ms.A0E(str2);
            throw null;
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(2067516711);
        super.onCreate(bundle);
        C04530Oa r0 = this.A0N;
        this.A09 = new C58133Eb(this, AnonymousClass0wJ.A0X(r0));
        AnonymousClass00F r4 = requireActivity().mOnBackPressedDispatcher;
        C04220Ms.A06(r4);
        r4.A05(new IDxPCallbackShape32S0100000_I2((AnonymousClass0YY) new KtLambdaShape163S0100000_I2_18(this, 44)), this);
        AnonymousClass3F7 r5 = new AnonymousClass3F7(this, AnonymousClass0wJ.A0X(r0));
        this.A08 = r5;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Fragment fragment = r5.A00;
        Drawable drawable = fragment.requireContext().getDrawable(R.drawable.instagram_users_outline_96);
        if (drawable != null) {
            drawable.setTint(fragment.requireContext().getColor(R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color));
        }
        A0v.add(new AnonymousClass3CU(drawable, AnonymousClass250.RECIPROCAL_FOLLOWS, C18190wL.A0g(AnonymousClass0wJ.A0B(fragment), 2131822299), (String) null, true));
        A0v.add(new AnonymousClass3CU(C19557AyI.A01(fragment.requireContext()), AnonymousClass250.CLOSE_FRIENDS, C18190wL.A0g(AnonymousClass0wJ.A0B(fragment), 2131822297), r5.A00(), false));
        List A0N2 = AnonymousClass00J.A0N(A0v);
        this.A0A = A0N2;
        this.A07 = new AnonymousClass111(this, A0N2);
        this.A03 = new AnonymousClass433(requireActivity(), AnonymousClass0wJ.A0X(r0));
        A00(this);
        C14030oh.A09(2058990963, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(878406718);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.birthday_effects_settings_fragment, viewGroup, false);
        this.A04 = (CircularImageView) AnonymousClass0wJ.A0I(inflate, R.id.birthday_effects_profile_pic_imageview);
        this.A05 = (CircularImageView) AnonymousClass0wJ.A0I(inflate, R.id.birthday_effects_take_selfie_imageview);
        CircularImageView circularImageView = (CircularImageView) inflate.findViewById(R.id.profile_birthday_confetti_circular_imageview);
        this.A0H = circularImageView;
        if (circularImageView != null) {
            C25702DqQ.A01(requireContext(), circularImageView);
        }
        CircularImageView circularImageView2 = (CircularImageView) inflate.findViewById(R.id.selfie_birthday_confetti_circular_imageview);
        this.A0K = circularImageView2;
        if (circularImageView2 != null) {
            C25702DqQ.A01(requireContext(), circularImageView2);
        }
        this.A0F = (IgSimpleImageView) AnonymousClass0wJ.A0I(inflate, R.id.birthday_effects_profile_pic_imageview_select_check_mark);
        this.A0G = (IgSimpleImageView) AnonymousClass0wJ.A0I(inflate, R.id.birthday_effects_take_selfie_imageview_select_check_mark);
        this.A0I = (CircularImageView) AnonymousClass0wJ.A0I(inflate, R.id.birthday_effects_profile_pic_imageview_overlay);
        this.A0J = (CircularImageView) AnonymousClass0wJ.A0I(inflate, R.id.birthday_effects_take_selfie_imageview_overlay);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.birthday_effects_audience_recycler_view);
        this.A0E = recyclerView;
        if (recyclerView != null) {
            AnonymousClass111 r0 = this.A07;
            if (r0 == null) {
                C04220Ms.A0E("audienceAdapter");
                throw null;
            }
            recyclerView.setAdapter(r0);
        }
        RecyclerView recyclerView2 = this.A0E;
        if (recyclerView2 != null) {
            getContext();
            C18190wL.A1D(recyclerView2);
        }
        this.A06 = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0I(inflate, R.id.birthday_effects_settings_bottom_buttons);
        C14030oh.A09(-572476435, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1499844088);
        super.onDestroyView();
        this.A0E = null;
        this.A0H = null;
        this.A0K = null;
        A02(this);
        A01(this);
        getRootActivity();
        C14030oh.A09(-1149845300, A022);
    }
}
