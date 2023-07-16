package X;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.bloks.foa.screenqueries.screencontainer.BloksFragmentNavigationTracker$registerActivityLifecycleCallbacks$1;
import com.bloks.foa.screenqueries.screencontainer.ScreenContainerDelegate;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.facebook.redex.IDxDListenerShape451S0100000_1_I2;
import com.instagram.barcelona.R;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.1c7  reason: invalid class name */
public final class AnonymousClass1c7 extends C34640IcN implements C82424pb, C82034oy, C84884uA, C81884oY, C11510kK {
    public static final String __redex_internal_original_name = "IgBloksScreenQueryFragment";
    public C10300i6 A00;
    public AnonymousClass3T2 A01;
    public ScreenContainerDelegate A02;
    public LLE A03;
    public C130667qT A04;
    public C66863yS A05;
    public C30938GbW A06;
    public Integer A07;
    public boolean A08;
    public final IDxDListenerShape451S0100000_1_I2 A09 = new IDxDListenerShape451S0100000_1_I2(this, 0);

    /* renamed from: A02 */
    public final void BrU(C66863yS r4) {
        C04220Ms.A0B(r4, 0);
        this.A05 = r4;
        if (getContext() != null && isAdded()) {
            C66863yS r2 = this.A05;
            if (r2 != null) {
                if (C18190wL.A0F(this) != null) {
                    this.A07 = Integer.valueOf(C18190wL.A0F(this).getAttributes().softInputMode);
                    C18190wL.A0F(this).setSoftInputMode(r2.A00 | 2);
                }
                getRootActivity();
            }
            View view = this.mView;
            if (r4.A01 != null && view != null && view.getViewTreeObserver().isAlive()) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                IDxDListenerShape451S0100000_1_I2 iDxDListenerShape451S0100000_1_I2 = this.A09;
                viewTreeObserver.removeOnPreDrawListener(iDxDListenerShape451S0100000_1_I2);
                view.getViewTreeObserver().addOnPreDrawListener(iDxDListenerShape451S0100000_1_I2);
            }
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r14) {
        AnonymousClass3DD r4;
        boolean z;
        boolean z2;
        AnonymousClass17Q r0;
        C109326jp r2;
        int A032;
        int i;
        C04220Ms.A0B(r14, 0);
        C66863yS r02 = this.A05;
        AnonymousClass3HX r3 = null;
        if (r02 != null) {
            r4 = r02.A01;
        } else {
            r4 = null;
        }
        boolean z3 = false;
        if (r4 != null) {
            z = r4.A08;
        } else {
            z = false;
        }
        r14.CtO(!z);
        if (!z) {
            if (r4 != null) {
                z2 = r4.A07;
                r0 = r4.A00;
            } else {
                z2 = false;
                r0 = null;
            }
            if (r0 != null) {
                AnonymousClass17Q r22 = r4.A00;
                C25435DlZ A002 = A00(r22, false);
                if (r22.A05 != null) {
                    r14.A6M(A002);
                    r14.AJa(0, r22.A06);
                    z2 = true;
                } else if (r22.A02 != null) {
                    r14.Crl(A002);
                    ((E2V) r14).A0P.setEnabled(r22.A06);
                    z2 = false;
                }
            } else {
                C66863yS r03 = this.A05;
                if (!(r03 == null || (r2 = r03.A02) == null)) {
                    C25764Drc A0K = C18240wQ.A0K();
                    A0K.A0C = C18200wM.A0R(this, r2, 21);
                    A0K.A00 = R.drawable.instagram_arrow_left_pano_outline_24;
                    AnonymousClass4u2.A03(A0K, r14);
                    z2 = false;
                }
            }
            r14.CtT(!z2);
            if (r4 != null) {
                List list = r4.A06;
                if (list != null) {
                    int i2 = 0;
                    for (Object next : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            C06750aI.A1A();
                            throw null;
                        }
                        AnonymousClass17Q r9 = (AnonymousClass17Q) next;
                        View A7Q = r14.A7Q(A00(r9, true));
                        if (r9.A02 != null && (i = r9.A00) > 0 && (A7Q instanceof ImageView)) {
                            ImageView imageView = (ImageView) A7Q;
                            imageView.setActivated(true);
                            imageView.setImageLevel(i);
                        }
                        r14.AJh(i2, r9.A06);
                        i2 = i3;
                    }
                }
                C127397h3 r7 = r4.A01;
                if (r7 == null || getContext() == null) {
                    String str = r4.A05;
                    if (str != null) {
                        String str2 = r4.A04;
                        if (str2 != null) {
                            r14.Cnm(str, str2);
                        } else {
                            r14.setTitle(str);
                        }
                    }
                } else {
                    if (!z2) {
                        A032 = 0;
                    } else {
                        A032 = C18220wO.A03(AnonymousClass0wJ.A0B(this));
                    }
                    LLE lle = this.A03;
                    if (lle == null) {
                        lle = new LLE(requireContext());
                        this.A03 = lle;
                    }
                    ScreenContainerDelegate screenContainerDelegate = this.A02;
                    if (screenContainerDelegate != null) {
                        r3 = screenContainerDelegate.A04.A02();
                        C04220Ms.A06(r3);
                    }
                    lle.setLazyRenderTreeProvider(new C127387h2(requireContext(), r3, r7, AnonymousClass2LE.A00(r3)));
                    r14.Cjs(lle, A032, 0, false);
                }
            }
            if (getContext() != null && C34822La.A00(requireContext())) {
                z3 = true;
            }
            if (r4 != null) {
                Integer num = r4.A02;
                if ((num != null && z3) || ((num = r4.A03) != null && !z3)) {
                    ((E2V) r14).A0K.setBackground(new ColorDrawable(num.intValue()));
                }
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        C04220Ms.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        ScreenContainerDelegate screenContainerDelegate = this.A02;
        if (screenContainerDelegate != null) {
            screenContainerDelegate.A03.A00(bundle, true);
            switch (screenContainerDelegate.A01.intValue()) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                default:
                    i = 0;
                    break;
            }
            bundle.putInt("bloks_screen_navigation_state", i);
        }
        AnonymousClass3T2 r0 = this.A01;
        if (r0 != null) {
            bundle.putInt("key_bloks_navigation_tracker_backstack_size", r0.A01);
            AnonymousClass3T2 r02 = this.A01;
            if (r02 != null) {
                AnonymousClass3T2.A00(r02);
                return;
            }
        }
        C04220Ms.A0E("navigationTracker");
        throw null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = getRootActivity().findViewById(R.id.layout_container_center_right_coordinator_layout);
        if (findViewById != null) {
            view = findViewById;
        }
        C30938GbW gbW = this.A06;
        if (gbW == null) {
            C04220Ms.A0E("viewpointManager");
            throw null;
        } else {
            gbW.A04(view, C35004Ikn.A00(this));
        }
    }

    private final C25435DlZ A00(AnonymousClass17Q r6, boolean z) {
        C25764Drc A0K;
        IDxCListenerShape70S0200000_1_I2 A0R = C18200wM.A0R(this, r6, 22);
        String str = r6.A05;
        if (str != null) {
            boolean A0I = C04220Ms.A0I(r6.A04, "regular");
            A0K = C18240wQ.A0K();
            A0K.A0F = str;
            A0K.A0C = A0R;
            A0K.A0G = r6.A03;
            int i = 0;
            if (A0I) {
                i = R.style.ActionBarTextButton;
            }
            A0K.A0A = i;
        } else {
            Integer num = r6.A02;
            if (num != null) {
                A0K = C18240wQ.A0K();
                A0K.A0G = r6.A03;
                A0K.A0C = A0R;
                if (z) {
                    int A012 = AnonymousClass3JR.A01(num);
                    A0K.A05 = A012;
                    A0K.A04 = AnonymousClass3JR.A00(num);
                    if (r6.A00 > 0) {
                        C86724yA r0 = new C86724yA(requireContext(), A012);
                        r0.A01();
                        A0K.A0B = r0;
                    }
                } else {
                    A0K.A04(AnonymousClass3JR.A01(num));
                }
            } else {
                throw C18180wK.A0a("Navbar button must have an icon or a title");
            }
        }
        return new C25435DlZ(A0K);
    }

    public static final boolean A01(AnonymousClass1c7 r5, C109326jp r6, boolean z) {
        ScreenContainerDelegate screenContainerDelegate = r5.A02;
        if (screenContainerDelegate != null) {
            AnonymousClass3HX A022 = screenContainerDelegate.A04.A02();
            C04220Ms.A06(A022);
            C127397h3 r2 = AnonymousClass7K7.A01(A022).A04;
            if (r2 != null) {
                if (z) {
                    r5.A08 = true;
                }
                C122047Jt.A03(A022, r2, C63893iY.A05(AnonymousClass3VO.A00(), A022, 0), r6);
                if (z) {
                    r5.A08 = false;
                }
                return true;
            }
        }
        return false;
    }

    public final String AwK() {
        String str;
        ScreenContainerDelegate screenContainerDelegate = this.A02;
        if (screenContainerDelegate != null) {
            str = screenContainerDelegate.A03.A06;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "bloks_unknown_class";
        }
        C04220Ms.A06(str);
        return str;
    }

    public final void CnI(AnonymousClass3B8 r2) {
        ScreenContainerDelegate screenContainerDelegate = this.A02;
        if (screenContainerDelegate != null) {
            screenContainerDelegate.A00 = r2;
            if (r2 != null) {
                screenContainerDelegate.A00();
            }
        }
    }

    public final String getModuleName() {
        Bundle bundle;
        String string;
        String str;
        ScreenContainerDelegate screenContainerDelegate = this.A02;
        Bundle bundle2 = this.mArguments;
        if (screenContainerDelegate != null && (str = screenContainerDelegate.A03.A05) != null) {
            return str;
        }
        if (bundle2 == null || (bundle = bundle2.getBundle("key_screen_container_props_bundle")) == null || (string = bundle.getString("key_analytics_module")) == null) {
            return "bloks_unknown";
        }
        return string;
    }

    public final C10300i6 getSession() {
        C10300i6 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18250wR.A0l();
        throw null;
    }

    public final String getUrl() {
        String str;
        ScreenContainerDelegate screenContainerDelegate = this.A02;
        if (screenContainerDelegate != null) {
            str = screenContainerDelegate.A03.A06;
        } else {
            str = null;
        }
        String A0j = C18180wK.A0j("instagram://bloks/?app_id=%s", new Object[]{str});
        C04220Ms.A06(A0j);
        return A0j;
    }

    public final boolean onBackPressed() {
        C109326jp r1;
        C66863yS r0 = this.A05;
        if (r0 == null || (r1 = r0.A02) == null || this.A08) {
            return false;
        }
        return A01(this, r1, true);
    }

    public final void afterOnResume() {
        super.afterOnResume();
        C66863yS r0 = this.A05;
        if (r0 != null) {
            BrU(r0);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        String str;
        Throwable noSuchElementException;
        int i;
        int i2;
        String str2;
        int A022 = C14030oh.A02(-1445417828);
        super.onCreate(bundle);
        this.A00 = C18200wM.A0V(this);
        this.A06 = new C30938GbW(AnonymousClass3S3.A01.A00, new C54042yo());
        C10300i6 session = getSession();
        C30938GbW gbW = this.A06;
        if (gbW == null) {
            str2 = "viewpointManager";
        } else {
            this.A04 = C130667qT.A01(this, this, session, gbW);
            if (bundle == null) {
                bundle2 = requireArguments();
            } else {
                bundle2 = bundle;
            }
            try {
                C66833yP A002 = AnonymousClass2Bh.A00(bundle2);
                if (A002 != null) {
                    C81864oW r1 = A002.A03;
                    C04220Ms.A0C(r1, "null cannot be cast to non-null type com.instagram.bloks.screenquery.IgBloksScreenQueryConfig");
                    this.A05 = (C66863yS) r1;
                    Context requireContext = requireContext();
                    C130667qT r9 = this.A04;
                    if (r9 == null) {
                        str2 = "host";
                    } else {
                        try {
                            int i3 = bundle2.getInt("bloks_screen_navigation_state", 0);
                            Integer[] A1Z = C18240wQ.A1Z();
                            int length = A1Z.length;
                            int i4 = 0;
                            while (i4 < length) {
                                Integer num = A1Z[i4];
                                switch (num.intValue()) {
                                    case 1:
                                        i = 1;
                                        break;
                                    case 2:
                                        i = 2;
                                        break;
                                    default:
                                        i = 0;
                                        break;
                                }
                                if (i == i3) {
                                    try {
                                        C66833yP A003 = AnonymousClass2Bh.A00(bundle2);
                                        if (A003 != null) {
                                            this.A02 = C32322Bg.A00(requireContext, A003, this, r9, num);
                                            FragmentActivity requireActivity = requireActivity();
                                            C12560m7 parentFragmentManager = getParentFragmentManager();
                                            ScreenContainerDelegate screenContainerDelegate = this.A02;
                                            if (bundle != null) {
                                                i2 = bundle.getInt("key_bloks_navigation_tracker_backstack_size");
                                            } else {
                                                i2 = parentFragmentManager.A0I();
                                            }
                                            this.A01 = new AnonymousClass3T2(requireActivity, parentFragmentManager, screenContainerDelegate, i2);
                                            C14030oh.A09(1935611107, A022);
                                            return;
                                        }
                                        throw C18180wK.A0a("args Bundle must contain ScreenContainerProps");
                                    } catch (RuntimeException e) {
                                        noSuchElementException = new AnonymousClass2AV(e);
                                    }
                                } else {
                                    i4++;
                                }
                            }
                            noSuchElementException = new NoSuchElementException(C28174Ezk.A00(6));
                            throw noSuchElementException;
                        } catch (AnonymousClass2AV e2) {
                            Bundle bundle3 = bundle2.getBundle("key_screen_container_props_bundle");
                            if (bundle3 != null) {
                                str = bundle3.getString("key_app_id");
                            } else {
                                str = null;
                            }
                            C30967GcS.A01((AnonymousClass3HX) null, "ScreenContainerDelegate", AnonymousClass00U.A0L("Failed to properly initialize screen props for screen with appId: ", str), e2, 0);
                            throw e2;
                        }
                    }
                } else {
                    throw C18180wK.A0a("args Bundle must contain ScreenContainerProps");
                }
            } catch (RuntimeException e3) {
                throw new AnonymousClass2AV(e3);
            }
        }
        C04220Ms.A0E(str2);
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-806930329);
        ScreenContainerDelegate screenContainerDelegate = this.A02;
        if (screenContainerDelegate != null) {
            Context context = screenContainerDelegate.A02;
            C121247Ez r3 = screenContainerDelegate.A04;
            LLF llf = new LLF(context);
            llf.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            r3.A06(llf);
            C14030oh.A09(-1486793311, A022);
            return llf;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(977703376, A022);
        throw A0b;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1804083104);
        super.onDestroyView();
        View view = this.mView;
        if (view != null && view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.A09);
        }
        this.A03 = null;
        ScreenContainerDelegate screenContainerDelegate = this.A02;
        if (screenContainerDelegate != null) {
            screenContainerDelegate.A04.A04();
        }
        C14030oh.A09(-894469576, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-945267295);
        super.onPause();
        Integer num = this.A07;
        if (num != null) {
            int intValue = num.intValue();
            Window A0F = C18190wL.A0F(this);
            if (A0F != null) {
                A0F.setSoftInputMode(intValue);
            }
        }
        getRootActivity();
        C14030oh.A09(-1772745643, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-1870192875);
        super.onStart();
        AnonymousClass3T2 r2 = this.A01;
        if (r2 == null) {
            C04220Ms.A0E("navigationTracker");
            throw null;
        }
        if (r2.A00 == null) {
            r2.A00 = new BloksFragmentNavigationTracker$registerActivityLifecycleCallbacks$1(r2);
            Context applicationContext = r2.A02.getApplicationContext();
            C04220Ms.A0C(applicationContext, AnonymousClass000.A00(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED));
            ((Application) applicationContext).registerActivityLifecycleCallbacks(r2.A00);
        }
        ScreenContainerDelegate screenContainerDelegate = r2.A04;
        if (screenContainerDelegate != null) {
            screenContainerDelegate.A00();
        }
        C14030oh.A09(-928872832, A022);
    }

    public final void onStop() {
        Integer num;
        int A022 = C14030oh.A02(547742261);
        super.onStop();
        AnonymousClass3T2 r3 = this.A01;
        if (r3 == null) {
            C04220Ms.A0E("navigationTracker");
            throw null;
        }
        C12560m7 r2 = r3.A03;
        int A0I = r2.A0I();
        int i = r3.A01;
        if (A0I < i) {
            num = AnonymousClass006.A0C;
        } else {
            if (r2.A0I() > i) {
                num = AnonymousClass006.A01;
            }
            C14030oh.A09(1083828243, A022);
        }
        AnonymousClass3T2.A00(r3);
        ScreenContainerDelegate screenContainerDelegate = r3.A04;
        if (screenContainerDelegate != null) {
            screenContainerDelegate.A01(num);
        }
        C14030oh.A09(1083828243, A022);
    }
}
