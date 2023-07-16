package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.0yI  reason: invalid class name and case insensitive filesystem */
public final class C18960yI extends FrameLayout {
    public C81744oI A00;
    public boolean A01;
    public final TextView A02;
    public final TextView A03;
    public final ConstraintLayout A04 = ((ConstraintLayout) AnonymousClass0wJ.A0I(this, R.id.quadcard_accessibility_wrapper));
    public final IgFrameLayout A05;
    public final IgFrameLayout A06;
    public final IgFrameLayout A07;
    public final IgFrameLayout A08;
    public final IgdsMediaButton A09;
    public final C19110zC A0A;
    public final Set A0B;

    public /* synthetic */ C18960yI(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A0A = new C19110zC(context);
        View.inflate(context, R.layout.igds_immersive_quadcard_containerview, this);
        IgFrameLayout igFrameLayout = (IgFrameLayout) AnonymousClass0wJ.A0I(this, R.id.igds_quadcard_top_start);
        this.A08 = igFrameLayout;
        IgFrameLayout igFrameLayout2 = (IgFrameLayout) AnonymousClass0wJ.A0I(this, R.id.igds_quadcard_top_end);
        this.A07 = igFrameLayout2;
        IgFrameLayout igFrameLayout3 = (IgFrameLayout) AnonymousClass0wJ.A0I(this, R.id.igds_quadcard_bottom_start);
        this.A06 = igFrameLayout3;
        IgFrameLayout igFrameLayout4 = (IgFrameLayout) AnonymousClass0wJ.A0I(this, R.id.igds_quadcard_bottom_end);
        this.A05 = igFrameLayout4;
        Set<View> A082 = AnonymousClass4WM.A08(igFrameLayout, igFrameLayout2, igFrameLayout3, igFrameLayout4);
        this.A0B = A082;
        if (AnonymousClass3JA.A01(context)) {
            C18210wN.A0y(this);
            setOnClickListener(C18210wN.A0H(this, 324));
        }
        for (View view : A082) {
            view.setBackgroundResource(R.drawable.immersive_netego_border);
            view.setClipToOutline(true);
        }
        this.A03 = (TextView) AnonymousClass0wJ.A0I(this, R.id.quadcard_title);
        this.A02 = (TextView) AnonymousClass0wJ.A0I(this, R.id.quadcard_subtitle);
        View findViewById = findViewById(R.id.quadcard_footer_button);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) findViewById;
        igdsMediaButton.setButtonStyle(AnonymousClass25V.SECONDARY_ON_BLACK);
        igdsMediaButton.setSize(C308423e.LARGE);
        C04220Ms.A06(findViewById);
        this.A09 = igdsMediaButton;
        setWillNotDraw(false);
    }

    public final void onDraw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        super.onDraw(canvas);
        if (getHeight() != 0 && !this.A01) {
            Context context = getContext();
            float A012 = C09860go.A01(context, (float) getHeight());
            float A013 = C09860go.A01(context, (float) C29289Flg.A00(context));
            if (getParent() instanceof IgFrameLayout) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                String A002 = C28174Ezk.A00(1);
                C04220Ms.A0C(layoutParams, A002);
                ((FrameLayout.LayoutParams) layoutParams).height = C09860go.A07(context) - C121907Is.A01(context, R.attr.tabBarHeight);
                ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                C04220Ms.A0C(layoutParams2, A002);
                ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = C18240wQ.A01(context, 16);
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                C04220Ms.A0C(layoutParams3, A002);
                float A014 = (A012 - C09860go.A01(context, (float) ((FrameLayout.LayoutParams) layoutParams3).height)) + A013 + ((float) 8);
                if (A014 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    for (View view : this.A0B) {
                        view.getLayoutParams().height -= (int) C09860go.A00(context, Math.abs(A014) / ((float) 2));
                        view.requestLayout();
                    }
                }
            } else {
                C10450iM.A03("IGImmersiveQuadCardCont", "Unsupported parent layout. Please add to an IgFrameLayout or we can add support for other parent view types");
            }
            requestLayout();
            this.A01 = true;
        }
    }

    public final void setCardProvider(C81744oI r11) {
        C19040yX r2;
        C04220Ms.A0B(r11, 0);
        this.A00 = r11;
        this.A0A.A00 = r11;
        int i = 0;
        for (Object next : this.A0B) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            ViewGroup viewGroup = (ViewGroup) next;
            if (i < 1) {
                viewGroup.removeAllViews();
                C81744oI r7 = this.A00;
                if (r7 != null) {
                    AnonymousClass4MD r72 = (AnonymousClass4MD) r7;
                    User user = new User("123", "test");
                    C15720rm r5 = new C15720rm("ExampleSuggestedUsersCardProvider");
                    user.A03 = C23894D0g.FollowStatusNotFollowing;
                    r2 = new C19040yX(r72.A00);
                    C25917DvL dvL = r2.A05.A03;
                    C04220Ms.A06(dvL);
                    dvL.A0B = false;
                    dvL.A02(r5, r72.A01, user);
                    r2.setSuggestedUserName("Samer Kadamani");
                    r2.setSubtitleText("Suggested for you");
                    AnonymousClass0wJ.A17(r2, 327, r72);
                    r2.setOnDismissClickListener(C18210wN.A0H(r72, 328));
                    r2.setAvatarImage(user.B4M(), r5);
                } else {
                    r2 = null;
                }
                viewGroup.addView(r2);
                viewGroup.setVisibility(0);
            } else {
                viewGroup.setVisibility(4);
            }
            i = i2;
        }
    }

    public final void setHeader(String str) {
        C04220Ms.A0B(str, 0);
        setHeader(str, (String) null);
    }

    public static /* synthetic */ void setFooter$default(C18960yI r1, String str, Integer num, AnonymousClass0ZU r4, int i, Object obj) {
        if ((i & 4) != 0) {
            r4 = C77384fh.A00;
        }
        r1.setFooter(str, num, r4);
    }

    public static /* synthetic */ void setHeader$default(C18960yI r1, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        r1.setHeader(str, str2);
    }

    private final void setStaggered(boolean z) {
        Context context;
        int A012;
        int i;
        int A013;
        int A014;
        int A015;
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        String A002 = I17.A00(1);
        C04220Ms.A0C(layoutParams, A002);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams2 = this.A06.getLayoutParams();
        C04220Ms.A0C(layoutParams2, A002);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        IgdsMediaButton igdsMediaButton = this.A09;
        if (!z) {
            igdsMediaButton.setVisibility(0);
            context = getContext();
            A012 = C18240wQ.A01(context, 4);
            i = 8;
            A013 = C18240wQ.A01(context, 8);
            A014 = C18240wQ.A01(context, 16);
            A015 = C18240wQ.A01(context, 0);
        } else {
            igdsMediaButton.setVisibility(4);
            context = getContext();
            A012 = C18240wQ.A01(context, 4);
            i = 48;
            A013 = C18240wQ.A01(context, 48);
            A014 = C18240wQ.A01(context, 16);
            A015 = C18240wQ.A01(context, 0);
        }
        marginLayoutParams.setMargins(A012, A013, A014, A015);
        marginLayoutParams2.setMargins(C18240wQ.A01(context, 16), C18240wQ.A01(context, i), C18240wQ.A01(context, 4), C18240wQ.A01(context, 0));
    }

    private final void setTitleHasPadding(boolean z) {
        int i;
        TextView textView = this.A03;
        if (z) {
            i = C18240wQ.A01(getContext(), 16);
        } else {
            i = 0;
        }
        textView.setPadding(0, 0, 0, i);
    }

    public final C81744oI getCardProvider() {
        return this.A00;
    }

    public final void setFooter(String str, AnonymousClass0ZU r3) {
        AnonymousClass0wJ.A1N(str, r3);
        setFooter(str, (Integer) null, r3);
    }

    public static /* synthetic */ void setFooter$default(C18960yI r1, String str, AnonymousClass0ZU r3, int i, Object obj) {
        if ((i & 2) != 0) {
            r3 = C77374fg.A00;
        }
        r1.setFooter(str, r3);
    }

    public final void setFooter(String str, Integer num, AnonymousClass0ZU r6) {
        AnonymousClass0wJ.A1M(str, 0, r6);
        IgdsMediaButton igdsMediaButton = this.A09;
        igdsMediaButton.setLabel(str);
        setStaggered(false);
        if (num != null) {
            igdsMediaButton.setStartAddOn(new AnonymousClass3SM(num.intValue()), (CharSequence) null);
        }
        AnonymousClass0wJ.A17(igdsMediaButton, 325, r6);
    }

    public final void setHeader(String str, String str2) {
        C04220Ms.A0B(str, 0);
        this.A03.setText(str);
        if (str2 != null) {
            this.A02.setText(str2);
            return;
        }
        this.A02.setVisibility(8);
        setTitleHasPadding(true);
    }
}
