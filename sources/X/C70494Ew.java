package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.4Ew  reason: invalid class name and case insensitive filesystem */
public final class C70494Ew implements C84564tQ {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View A02;
    public ProgressBar A03;
    public TextView A04;
    public CircularImageView A05;
    public IgdsHeadline A06;
    public IgSwitch A07;
    public ProgressButton A08;
    public final C58573Gh A09;
    public final C82844qM A0A;

    public final /* bridge */ /* synthetic */ void Btd(Context context, Object obj) {
        this.A03 = null;
        this.A02 = null;
        this.A07 = null;
        this.A06.setOnClickListener((View.OnClickListener) null);
        this.A06 = null;
        this.A05 = null;
        this.A08.setOnClickListener((View.OnClickListener) null);
        this.A08 = null;
        this.A04.setOnClickListener((View.OnClickListener) null);
        this.A04 = null;
    }

    public final /* bridge */ /* synthetic */ void BlL(Context context, Object obj) {
        this.A03.setVisibility(8);
    }

    public final /* bridge */ /* synthetic */ void BlM(Context context, Object obj) {
        this.A03.setVisibility(0);
    }

    public final /* bridge */ /* synthetic */ void D8s(Context context, Object obj) {
        AnonymousClass3D8 r9 = (AnonymousClass3D8) obj;
        int i = 0;
        if (r9.A00 == null) {
            this.A02.setVisibility(8);
            this.A05.setBackgroundResource(R.drawable.reg_photo);
            CircularImageView circularImageView = this.A05;
            C63393hP.A03(circularImageView.getContext(), circularImageView.getBackground().mutate(), R.color.igds_primary_text);
            this.A08.setText(2131821097);
            this.A08.setOnClickListener(this.A01);
            this.A04.setVisibility(0);
            return;
        }
        this.A05.setBackground((Drawable) null);
        boolean A1W = C18180wK.A1W(this.A02.getVisibility());
        View view = this.A02;
        boolean z = r9.A03;
        C82844qM r0 = this.A0A;
        if (!z && r0 == null) {
            i = 8;
        }
        view.setVisibility(i);
        if (!A1W && this.A02.getVisibility() == 0) {
            this.A07.setChecked(true);
        }
        this.A08.setText(2131831737);
        this.A08.setOnClickListener(this.A00);
        this.A04.setVisibility(8);
    }

    public final /* bridge */ /* synthetic */ void D9X(Context context, Object obj) {
        AnonymousClass3D8 r4 = (AnonymousClass3D8) obj;
        this.A05.setImageBitmap(r4.A00);
        Bitmap bitmap = r4.A00;
        CircularImageView circularImageView = this.A05;
        if (bitmap != null) {
            circularImageView.setStrokeAlpha(circularImageView.A00);
            return;
        }
        circularImageView.setStrokeAlpha(0);
        this.A03.setVisibility(8);
    }

    public final /* bridge */ /* synthetic */ void D9s(Context context, Object obj) {
        Bitmap bitmap = ((AnonymousClass3D8) obj).A00;
        IgdsHeadline igdsHeadline = this.A06;
        if (bitmap != null) {
            igdsHeadline.setHeadline(2131833001);
            this.A06.setBody(2131823222);
            this.A06.setLink(context.getResources().getString(2131823222), this.A01);
            return;
        }
        igdsHeadline.setHeadline(2131821100);
        this.A06.setBody(2131821099);
        this.A06.setOnClickListener((View.OnClickListener) null);
    }

    public C70494Ew(C58573Gh r1, C82844qM r2) {
        this.A0A = r2;
        this.A09 = r1;
    }

    public final /* bridge */ /* synthetic */ void CUM(Context context, View view, Object obj) {
        this.A03 = (ProgressBar) view.requireViewById(R.id.add_photo_progress_spinner);
        this.A02 = view.requireViewById(R.id.share_profile_photo_to_feed_container);
        this.A07 = C18250wR.A0N(view, R.id.share_profile_photo_to_feed_switch);
        this.A06 = C18240wQ.A0S(view, R.id.field_title_igds);
        this.A05 = (CircularImageView) view.requireViewById(R.id.add_photo_view);
        this.A08 = (ProgressButton) view.requireViewById(R.id.progress_button);
        this.A04 = AnonymousClass0wJ.A0L(view, R.id.skip_button);
        this.A01 = C18190wL.A0H(this, 588);
        this.A00 = C18190wL.A0H(this, 589);
        this.A05.setStrokeAlpha(0);
        this.A05.setOnClickListener(this.A01);
        this.A08.setOnClickListener(this.A01);
        AnonymousClass0wJ.A16(this.A04, 590, this);
    }
}
