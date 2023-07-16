package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.FileProvider;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxAListenerShape459S0100000_1_I2;
import com.facebook.redex.IDxDListenerShape644S0100000_1_I2;
import com.facebook.redex.IDxHDelegateShape496S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.task.IDxCallbackShape24S0300000_1_I2;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.Locale;

/* renamed from: X.1cR  reason: invalid class name */
public final class AnonymousClass1cR extends C34640IcN implements C82424pb, L56, CallerContextable {
    public static final String __redex_internal_original_name = "AddProfilePhotoFragment";
    public Bitmap A00;
    public C69794Ai A01;
    public AnonymousClass3D8 A02;
    public C82794qH A03;
    public C84564tQ A04;
    public C67083yq A05;
    public UserSession A06;
    public C18330wh A07;
    public Boolean A08 = C18180wK.A0X();
    public boolean A09;
    public int A0A;
    public C690346m A0B;
    public C24591je A0C;
    public final C82794qH A0D = new C70484Ev(this);
    public final C82794qH A0E = new C70474Eu(this);
    public final C84214sk A0F = new IDxDListenerShape644S0100000_1_I2(this, 4);
    public final C58813Hj A0G = new C58813Hj();

    public final boolean BR2() {
        return true;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        r2.CtO(false);
    }

    public final String getModuleName() {
        return "register_flow_add_profile_photo";
    }

    public static void A00(AnonymousClass1cR r3) {
        int i;
        Bitmap bitmap = r3.A00;
        if (bitmap != null && bitmap.getHeight() < (i = r3.A0A)) {
            C13760oG.A00(bitmap);
            bitmap = Bitmap.createScaledBitmap(bitmap, i, i, true);
        }
        r3.A02.A00 = bitmap;
        r3.A04.D9X(r3.getContext(), r3.A02);
        r3.A04.D8s(r3.getContext(), r3.A02);
        r3.A04.D9s(r3.getContext(), r3.A02);
    }

    public static void A01(AnonymousClass1cR r3, String str) {
        if (C63173fJ.A05(AnonymousClass0TJ.A06, 18307568682146928L) || !C63173fJ.A05(AnonymousClass0TJ.A05, 18307568682212465L)) {
            AnonymousClass3Zp.A02(r3.A06, true);
            C32165H8c A0B2 = C63883iV.A0B(r3.A06, str, AnonymousClass264.A0S.A00().toUpperCase(Locale.US));
            A0B2.A00 = new AnonymousClass1iA(r3, str);
            C31155GhB.A03(A0B2);
            return;
        }
        r3.A04(AnonymousClass264.IG_FB_PROFILE_PIC_REG);
    }

    public final void A04(AnonymousClass264 r5) {
        UserSession userSession = this.A06;
        C62383Zj.A01(AnonymousClass2A9.A07, AnonymousClass2A8.A0G, userSession);
        if (!C62433Zv.A02(CallerContext.A00(AnonymousClass1cR.class), this.A06, "ig_add_profile_photo")) {
            UserSession userSession2 = this.A06;
            Boolean valueOf = Boolean.valueOf(this.A09);
            C04220Ms.A0B(userSession2, 0);
            AnonymousClass3XD.A00(userSession2, valueOf, "profile_photo", 24);
            if (C63173fJ.A05(AnonymousClass0TJ.A05, 18310506439779090L)) {
                C35762Os.A00().A00(this, this.A06, new IDxAListenerShape459S0100000_1_I2(this, 8)).A06(r5.A00());
                return;
            }
            C67363zQ.A08(this, this.A06, r5, C29771zH.A05);
            return;
        }
        new C18480xG((Uri) null, this.A01, 0).execute(new Void[0]);
    }

    public final C10300i6 getSession() {
        return this.A06;
    }

    public final boolean onBackPressed() {
        C62223Xv.A00(this.A06, (C313625r) null, Boolean.valueOf(this.A09), (Integer) null, "profile_photo");
        C58813Hj r4 = this.A0G;
        if (!r4.A02(this.mArguments)) {
            return false;
        }
        r4.A00(this.mArguments, new C566538a(this.A00, this.A08.booleanValue()));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r0 == null) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass1cR r5, boolean r6) {
        /*
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            boolean r0 = r2 instanceof X.C82844qM
            if (r0 == 0) goto L_0x0013
            r1 = r2
            X.4qM r1 = (X.C82844qM) r1
        L_0x000b:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0015
            r2.finish()
            return
        L_0x0013:
            r1 = 0
            goto L_0x000b
        L_0x0015:
            X.3Hj r4 = r5.A0G
            android.os.Bundle r0 = r5.mArguments
            boolean r0 = r4.A02(r0)
            if (r0 == 0) goto L_0x0032
            android.graphics.Bitmap r3 = r5.A00
            java.lang.Boolean r0 = r5.A08
            boolean r2 = r0.booleanValue()
            android.os.Bundle r1 = r5.mArguments
            X.38a r0 = new X.38a
            r0.<init>(r3, r2)
            r4.A01(r1, r0)
            return
        L_0x0032:
            if (r1 == 0) goto L_0x0038
            r1.Ben(r6)
            return
        L_0x0038:
            com.instagram.service.session.UserSession r0 = r5.A06
            X.38d r0 = X.AnonymousClass3Zq.A00(r0)
            if (r0 == 0) goto L_0x0065
            java.lang.String r3 = r0.A01
            java.lang.String r2 = r0.A00
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L_0x0051
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            java.lang.String r0 = r1.getString(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            java.lang.String r0 = "Cannot call from fragment that is not aware of the current user"
            X.AnonymousClass7Ko.A0D(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            android.os.Bundle r0 = r5.mArguments
            com.instagram.service.session.UserSession r0 = X.C18180wK.A0V(r0)
            X.AnonymousClass3Zq.A02(r1, r0, r3, r2)
            return
        L_0x0065:
            com.instagram.service.session.UserSession r0 = r5.A06
            X.3hk r1 = X.C63533hk.A02(r0)
            com.instagram.service.session.UserSession r0 = r5.A06
            java.lang.String r0 = r0.getUserId()
            boolean r0 = r1.A0I(r0)
            if (r0 != 0) goto L_0x008c
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            com.instagram.service.session.UserSession r0 = r5.A06
            X.Drz r2 = X.C63463hW.A00(r1, r0)
            android.os.Bundle r1 = r5.mArguments
            X.1ay r0 = new X.1ay
            r0.<init>()
            X.C18180wK.A0x(r1, r0, r2)
            return
        L_0x008c:
            X.3yq r0 = r5.A05
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cR.A02(X.1cR, boolean):void");
    }

    public final void A03(Bitmap bitmap) {
        C62313Yf.A00().A03();
        this.A00 = bitmap;
        this.A02.A00 = bitmap;
        A00(this);
        this.A04.BlL(getContext(), this.A02);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass1cR r1;
        String A0W;
        super.onActivityResult(i, i2, intent);
        C69794Ai r3 = this.A01;
        C84584tU r0 = r3.A01;
        if (r0 != null) {
            r0.onActivityResult(i, i2, intent);
        }
        if (i2 == -1) {
            if (i == 2) {
                File file = r3.A04;
                file.getClass();
                C69794Ai.A00(AnonymousClass3Zy.A01(intent, file), r3);
            } else if (i != 3) {
                if (i == 4 && (r1 = r3.A02) != null) {
                    File file2 = r3.A05;
                    file2.getClass();
                    AnonymousClass3HF r6 = new AnonymousClass3HF(r1, new AnonymousClass1XX());
                    String name = r3.A05.getName();
                    String str = "";
                    synchronized (C63253h7.class) {
                        if (C63253h7.A01 == null) {
                            C63253h7.A04();
                        }
                        if (TextUtils.isEmpty(str) && !name.contains(".")) {
                            str = ".jpg";
                            C18250wR.A1G("Filepath requested without extension. title=", name, "PhotoStorage");
                        }
                        A0W = AnonymousClass00U.A0W(C63253h7.A01, name, str, '/');
                    }
                    r3.A05 = new File(A0W);
                    Context requireContext = r3.A02.requireContext();
                    File file3 = r3.A05;
                    ContentResolver contentResolver = requireContext.getContentResolver();
                    requireContext.revokeUriPermission(FileProvider.A00(requireContext, file2, "com.instagram.fileprovider"), 3);
                    H8a h8a = new H8a(new AnonymousClass4Tw(contentResolver, file2, file3), 482);
                    h8a.A00 = new IDxCallbackShape24S0300000_1_I2(0, intent, r3, r6);
                    C31155GhB.A03(h8a);
                }
            } else if (intent.getAction() != null) {
                new C18480xG(C15430rJ.A01(intent.getAction()), r3, 1).execute(new Void[0]);
            }
        }
        C67363zQ.A06(intent, this.A06, this.A0F, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r1.getBoolean("extra_standalone") == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -1936050066(0xffffffff8c9a386e, float:-2.376142E-31)
            int r3 = X.C14030oh.A02(r0)
            super.onCreate(r5)
            android.os.Bundle r0 = r4.mArguments
            com.instagram.service.session.UserSession r0 = X.C18180wK.A0V(r0)
            r4.A06 = r0
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "extra_standalone"
            boolean r1 = r1.getBoolean(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r4.A09 = r0
            com.instagram.service.session.UserSession r1 = r4.A06
            X.4Ai r0 = new X.4Ai
            r0.<init>(r5, r4, r1)
            r4.A01 = r0
            X.1je r0 = new X.1je
            r0.<init>(r4)
            r4.A0C = r0
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x0048
            X.0wh r2 = X.C18330wh.A01(r4)
            r4.A07 = r2
            android.content.Context r1 = r4.requireContext()
            r0 = 2131830080(0x7f112540, float:1.9293147E38)
            X.C18330wh.A02(r1, r2, r0)
        L_0x0048:
            r0 = -1701360348(0xffffffff9a974d24, float:-6.2576764E-23)
            X.C14030oh.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cR.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007d, code lost:
        if (r1.getBoolean("extra_save_profile_picture_on_exit", true) != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        if (r1.getBoolean("IS_SIGN_UP_FLOW") == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (r1.getBoolean("extra_enable_share_to_feed", true) != false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) {
        /*
            r16 = this;
            r0 = 1569902709(0x5d92d075, float:1.32238552E18)
            int r3 = X.C14030oh.A02(r0)
            X.3YT r2 = X.AnonymousClass3YT.A00
            r9 = r16
            com.instagram.service.session.UserSession r1 = r9.A06
            java.lang.String r0 = "profile_photo"
            r2.A02(r1, r0)
            r0 = 2131496674(0x7f0c0ee2, float:1.861692E38)
            r4 = r17
            r1 = r18
            android.view.View r7 = X.AnonymousClass0wJ.A0H(r4, r1, r0)
            android.view.ViewGroup r2 = X.C18190wL.A0E(r7)
            com.instagram.service.session.UserSession r1 = r9.A06
            X.3yq r0 = new X.3yq
            r0.<init>(r9, r9, r1)
            r9.A05 = r0
            androidx.fragment.app.Fragment r0 = r0.A00
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = "IS_SIGN_UP_FLOW"
            r1.getBoolean(r0)
        L_0x0035:
            android.os.Bundle r0 = r9.mArguments
            X.3Hj r5 = X.AnonymousClass3X6.A00
            boolean r1 = r5.A02(r0)
            r6 = 1
            r0 = 2131495983(0x7f0c0c2f, float:1.8615518E38)
            if (r1 == 0) goto L_0x0046
            r0 = 2131495984(0x7f0c0c30, float:1.861552E38)
        L_0x0046:
            r4.inflate(r0, r2, r6)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r9)
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            float r0 = r1.getDimension(r0)
            int r0 = (int) r0
            r9.A0A = r0
            X.3Gh r4 = new X.3Gh
            r4.<init>(r9)
            androidx.fragment.app.FragmentActivity r2 = r9.getActivity()
            boolean r0 = r2 instanceof X.C82844qM
            if (r0 == 0) goto L_0x00fe
            X.4qM r2 = (X.C82844qM) r2
        L_0x0066:
            android.os.Bundle r1 = r9.mArguments
            r11 = -1
            if (r1 == 0) goto L_0x0071
            java.lang.String r0 = "extra_progress_button_label_resource_id"
            int r11 = r1.getInt(r0, r11)
        L_0x0071:
            android.os.Bundle r1 = r9.mArguments
            r14 = 0
            if (r1 == 0) goto L_0x007f
            java.lang.String r0 = "extra_save_profile_picture_on_exit"
            boolean r0 = r1.getBoolean(r0, r6)
            r15 = 0
            if (r0 == 0) goto L_0x0080
        L_0x007f:
            r15 = 1
        L_0x0080:
            com.instagram.service.session.UserSession r10 = r9.A06
            X.3yq r0 = r9.A05
            androidx.fragment.app.Fragment r0 = r0.A00
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0093
            java.lang.String r0 = "IS_SIGN_UP_FLOW"
            boolean r0 = r1.getBoolean(r0)
            r13 = 1
            if (r0 != 0) goto L_0x0094
        L_0x0093:
            r13 = 0
        L_0x0094:
            android.os.Bundle r1 = r9.mArguments
            if (r1 == 0) goto L_0x00a1
            java.lang.String r0 = "extra_enable_share_to_feed"
            boolean r0 = r1.getBoolean(r0, r6)
            r12 = 0
            if (r0 == 0) goto L_0x00a2
        L_0x00a1:
            r12 = 1
        L_0x00a2:
            android.os.Bundle r1 = r9.mArguments
            if (r1 == 0) goto L_0x00ae
            java.lang.String r0 = "extra_allow_skip"
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == 0) goto L_0x00af
        L_0x00ae:
            r14 = 1
        L_0x00af:
            X.3D8 r8 = new X.3D8
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r9.A02 = r8
            X.3yq r0 = r9.A05
            androidx.fragment.app.Fragment r0 = r0.A00
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x00c3
            java.lang.String r0 = "IS_SIGN_UP_FLOW"
            r1.getBoolean(r0)
        L_0x00c3:
            android.os.Bundle r0 = r9.mArguments
            boolean r0 = r5.A02(r0)
            if (r0 == 0) goto L_0x00f8
            X.4Ex r0 = new X.4Ex
            r0.<init>(r9, r4, r2)
        L_0x00d0:
            r9.A04 = r0
            X.KHr r4 = X.C38040KHr.A01
            java.lang.Class<X.45Q> r2 = X.AnonymousClass45Q.class
            com.instagram.service.session.UserSession r1 = r9.A06
            X.46m r0 = new X.46m
            r0.<init>(r1)
            r9.A0B = r0
            r4.A03(r0, r2)
            X.1je r0 = r9.A0C
            if (r0 == 0) goto L_0x00f1
            androidx.fragment.app.FragmentActivity r1 = r9.requireActivity()
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            X.1je r0 = r9.A0C
            r1.A0E(r0)
        L_0x00f1:
            r0 = -15154339(0xffffffffff18c35d, float:-2.0305704E38)
            X.C14030oh.A09(r0, r3)
            return r7
        L_0x00f8:
            X.4Ew r0 = new X.4Ew
            r0.<init>(r4, r2)
            goto L_0x00d0
        L_0x00fe:
            r2 = 0
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cR.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(1028438202);
        super.onDestroy();
        C69794Ai r1 = this.A01;
        r1.A02 = null;
        r1.A00 = null;
        C14030oh.A09(1437999379, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-2115344658);
        super.onDestroyView();
        C62313Yf A002 = C62313Yf.A00();
        synchronized (A002) {
            if (A002.A07) {
                A002.A03 = null;
            }
        }
        C690346m r2 = this.A0B;
        if (r2 != null) {
            C38040KHr.A01.A04(r2, AnonymousClass45Q.class);
            this.A0B = null;
        }
        this.A04.Btd(getContext(), this.A02);
        if (this.A0C != null) {
            ((BaseFragmentActivity) requireActivity()).A0F(this.A0C);
        }
        C14030oh.A09(-2009188936, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1924829688);
        super.onResume();
        A00(this);
        getContext();
        C14030oh.A09(619636078, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C69794Ai r2 = this.A01;
        AnonymousClass37S r0 = r2.A00;
        if (r0 != null) {
            bundle.putParcelable("AddAvatarHelper.IMAGE_METADATA", r0.A01);
        }
        File file = r2.A05;
        if (file != null) {
            bundle.putString("tempCameraPhotoFile", file.getPath());
        }
        File file2 = r2.A04;
        if (file2 != null) {
            bundle.putString("tempGalleryPhotoFile", file2.getPath());
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        ImageUrl imageUrl;
        Bitmap bitmap;
        super.onViewCreated(view, bundle);
        this.A04.CUM(getContext(), view, this.A02);
        C69794Ai r4 = this.A01;
        AnonymousClass1cR r0 = r4.A02;
        if (r0 != null) {
            r4.A01 = C25529DnJ.A02.A02(r0.getContext(), new IDxHDelegateShape496S0100000_1_I2(r4, 0), r4.A03);
            AnonymousClass37S r02 = r4.A00;
            if (r02 != null) {
                r4.A02.A03(r02.A00);
            }
        }
        C62313Yf A002 = C62313Yf.A00();
        synchronized (A002) {
            bool = A002.A05;
        }
        synchronized (A002) {
            imageUrl = A002.A02;
        }
        synchronized (A002) {
            bitmap = null;
            Bitmap bitmap2 = A002.A01;
            if (bitmap2 != null) {
                bitmap = bitmap2.copy(bitmap2.getConfig(), A002.A01.isMutable());
            }
        }
        if (Boolean.FALSE.equals(bool) && !AnonymousClass3WG.A02(imageUrl)) {
            this.A03 = this.A0D;
            if (bitmap != null) {
                this.A00 = bitmap;
                this.A02.A00 = bitmap;
                return;
            }
            Bitmap bitmap3 = ((BitmapDrawable) getContext().getDrawable(R.drawable.profile_anonymous_user)).getBitmap();
            this.A00 = bitmap3;
            this.A02.A00 = bitmap3;
            this.A04.BlM(getContext(), this.A02);
            AnonymousClass35V r1 = new AnonymousClass35V(this);
            synchronized (A002) {
                if (A002.A07) {
                    A002.A03 = r1;
                }
            }
        }
    }
}
