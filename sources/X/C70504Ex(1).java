package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Bitmap;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxTListenerShape94S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.nux.fragment.AddProfilePhotoUiRedesignDelegate$KitKatViewSwitcher$1;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

/* renamed from: X.4Ex  reason: invalid class name and case insensitive filesystem */
public final class C70504Ex implements C84564tQ {
    public LayoutTransition A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View.OnClickListener A03;
    public View.OnClickListener A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public IgSwitch A0C;
    public AnonymousClass3TK A0D;
    public ProgressButton A0E;
    public final C11630kW A0F;
    public final C58573Gh A0G;
    public final C82844qM A0H;

    public final /* bridge */ /* synthetic */ void BlL(Context context, Object obj) {
        this.A06.setVisibility(8);
    }

    public final /* bridge */ /* synthetic */ void BlM(Context context, Object obj) {
        this.A06.setVisibility(0);
    }

    public final /* bridge */ /* synthetic */ void CUM(Context context, View view, Object obj) {
        AnonymousClass3D8 r9 = (AnonymousClass3D8) obj;
        LayoutTransition layoutTransition = new LayoutTransition();
        this.A00 = layoutTransition;
        layoutTransition.enableTransitionType(4);
        this.A07 = C18220wO.A0J(view, R.id.photo_redesign_root_view);
        this.A05 = view.findViewById(R.id.share_profile_switch_container);
        this.A09 = AnonymousClass0wJ.A0L(view, R.id.skip_button);
        this.A0B = C18180wK.A0G(view, R.id.field_title);
        this.A0A = C18180wK.A0G(view, R.id.field_subtitle);
        this.A08 = AnonymousClass0wJ.A0L(view, R.id.import_from_facebook);
        this.A0E = (ProgressButton) view.requireViewById(R.id.progress_button);
        this.A06 = this.A07.findViewById(R.id.add_photo_progress_spinner);
        this.A0C = C18250wR.A0N(view, R.id.share_profile_photo_to_feed_switch);
        this.A04 = C18190wL.A0H(this, 583);
        this.A01 = C18190wL.A0H(this, 584);
        this.A03 = C18190wL.A0H(this, 585);
        this.A02 = C18190wL.A0H(this, 586);
        AnonymousClass0wJ.A16(this.A09, 587, this);
        if (!r9.A04) {
            this.A09.setVisibility(8);
        }
        this.A0E.setOnClickListener(this.A04);
        this.A08.setOnClickListener(this.A03);
        AnonymousClass3TK r4 = new AnonymousClass3TK(this.A0F);
        this.A0D = r4;
        ViewGroup A0G2 = C18240wQ.A0G(view, R.id.scene_root);
        r4.A05 = A0G2;
        Context context2 = view.getContext();
        r4.A01 = Scene.getSceneForLayout(A0G2, R.layout.nux_profile_photo_redesign_avatar_container, context2);
        r4.A02 = Scene.getSceneForLayout(r4.A05, R.layout.nux_profile_photo_redesign_preview_container, context2);
        TransitionSet transitionSet = new TransitionSet();
        r4.A04 = transitionSet;
        transitionSet.setOrdering(1);
        r4.A04.addTransition(new ChangeBounds());
        r4.A04.addTransition(new Fade(1));
        r4.A04.setDuration(150);
        r4.A03 = new AddProfilePhotoUiRedesignDelegate$KitKatViewSwitcher$1(r4);
        r4.A00 = context2.getDrawable(R.drawable.profile_anonymous_user);
        User A0Y = AnonymousClass0wJ.A0Y(r9.A01);
        r4.A06 = new AnonymousClass4SY(r9, r4, A0Y);
        r4.A07 = new AnonymousClass4SZ(r9, r4, A0Y);
        this.A0C.A07 = new IDxTListenerShape94S0300000_1_I2(1, this, view, r9);
        ViewGroup viewGroup = this.A07;
        if (viewGroup != null) {
            viewGroup.setLayoutTransition(this.A00);
        }
    }

    public final /* bridge */ /* synthetic */ void D8s(Context context, Object obj) {
        TextView textView;
        View.OnClickListener onClickListener;
        AnonymousClass3D8 r5 = (AnonymousClass3D8) obj;
        Bitmap bitmap = r5.A00;
        ProgressButton progressButton = this.A0E;
        if (bitmap == null) {
            progressButton.setText(2131821098);
            this.A0E.setOnClickListener(this.A04);
            textView = this.A08;
            onClickListener = this.A03;
        } else {
            int i = r5.A07;
            if (i == -1) {
                i = 2131831737;
            }
            progressButton.setText(i);
            this.A0E.setOnClickListener(this.A02);
            textView = this.A08;
            onClickListener = this.A01;
        }
        textView.setOnClickListener(onClickListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r1 != null) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void D9X(android.content.Context r6, java.lang.Object r7) {
        /*
            r5 = this;
            X.3D8 r7 = (X.AnonymousClass3D8) r7
            android.view.ViewGroup r1 = r5.A07
            if (r1 == 0) goto L_0x000b
            android.animation.LayoutTransition r0 = r5.A00
            r1.setLayoutTransition(r0)
        L_0x000b:
            android.graphics.Bitmap r1 = r7.A00
            r3 = 8
            if (r1 == 0) goto L_0x006f
            android.view.View r0 = r5.A06
            r0.setVisibility(r3)
            r2 = 0
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x0023
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0023
            X.4qM r0 = r5.A0H
            if (r0 == 0) goto L_0x006f
        L_0x0023:
            android.view.View r1 = r5.A05
            r0 = 0
            r1.setAlpha(r0)
            com.instagram.igds.components.switchbutton.IgSwitch r1 = r5.A0C
            r0 = 1
            r1.setChecked(r0)
            android.view.View r0 = r5.A05
            r0.setVisibility(r2)
            android.view.View r0 = r5.A05
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
        L_0x0049:
            android.view.View r0 = r5.A05
            int r0 = r0.getVisibility()
            if (r0 == r3) goto L_0x0077
            com.instagram.igds.components.switchbutton.IgSwitch r0 = r5.A0C
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x0077
            X.3TK r4 = r5.A0D
            android.transition.Scene r1 = r4.A02
            java.lang.Runnable r0 = r4.A07
            r1.setEnterAction(r0)
            r0 = 0
            android.view.ViewGroup r3 = r4.A05
            android.transition.Scene r2 = r4.A02
        L_0x0067:
            android.transition.Transition r1 = r4.A03
            int[] r0 = new int[r0]
            X.AnonymousClass3TK.A00(r2, r1, r3, r4, r0)
            return
        L_0x006f:
            android.view.View r0 = r5.A05
            r0.setVisibility(r3)
            if (r1 == 0) goto L_0x0077
            goto L_0x0049
        L_0x0077:
            X.3TK r4 = r5.A0D
            android.transition.Scene r1 = r4.A01
            java.lang.Runnable r0 = r4.A06
            r1.setEnterAction(r0)
            r0 = 0
            android.view.ViewGroup r3 = r4.A05
            android.transition.Scene r2 = r4.A01
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70504Ex.D9X(android.content.Context, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void D9s(Context context, Object obj) {
        TextView textView;
        int i;
        AnonymousClass3D8 r4 = (AnonymousClass3D8) obj;
        Bitmap bitmap = r4.A00;
        TextView textView2 = this.A0B;
        if (bitmap == null) {
            textView2.setText(2131821100);
            this.A0A.setVisibility(0);
            if (r4.A04) {
                this.A09.setVisibility(0);
            }
            textView = this.A08;
            i = 2131828973;
        } else {
            textView2.setText(2131833001);
            this.A0A.setVisibility(8);
            this.A09.setVisibility(8);
            textView = this.A08;
            i = 2131823222;
        }
        textView.setText(i);
    }

    public C70504Ex(C11630kW r1, C58573Gh r2, C82844qM r3) {
        this.A0F = r1;
        this.A0H = r3;
        this.A0G = r2;
    }

    public final /* bridge */ /* synthetic */ void Btd(Context context, Object obj) {
    }
}
