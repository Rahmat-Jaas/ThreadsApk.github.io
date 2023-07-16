package com.instagram.igds.components.banner;

import X.AnonymousClass0wJ;
import X.AnonymousClass2LX;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C29934Fwk;
import X.C83594rf;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsBanner extends LinearLayout {
    public C83594rf A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final View A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsBanner(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2.setVisibility(r0);
        r0 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r4 != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        r0.setVisibility(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        if (r6 != 1) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r6 == 3) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r5.A02;
        r1 = 0;
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r3 == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setDividerVisibility(int r6) {
        /*
            r5 = this;
            r4 = 0
            r2 = 3
            r1 = 1
            r0 = 2
            if (r6 == r0) goto L_0x0023
            if (r6 == r2) goto L_0x0023
            r3 = 0
            if (r6 == r1) goto L_0x000d
        L_0x000b:
            if (r6 != r2) goto L_0x000e
        L_0x000d:
            r4 = 1
        L_0x000e:
            android.view.View r2 = r5.A02
            r1 = 0
            r0 = 8
            if (r3 == 0) goto L_0x0016
            r0 = 0
        L_0x0016:
            r2.setVisibility(r0)
            android.view.View r0 = r5.A01
            if (r4 != 0) goto L_0x001f
            r1 = 8
        L_0x001f:
            r0.setVisibility(r1)
            return
        L_0x0023:
            r3 = 1
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.banner.IgdsBanner.setDividerVisibility(int):void");
    }

    public static /* synthetic */ void setBody$default(IgdsBanner igdsBanner, CharSequence charSequence, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = C18180wK.A0X();
        }
        igdsBanner.setBody(charSequence, bool);
    }

    private final void setIconInternal(Drawable drawable) {
        ImageView imageView = this.A03;
        int visibility = imageView.getVisibility();
        int i = 0;
        if (drawable == null) {
            i = 8;
        }
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(i);
        if (visibility != i) {
            int i2 = 1;
            if (imageView.getVisibility() == 0) {
                i2 = 8388611;
            }
            this.A05.setGravity(i2);
            this.A04.setGravity(i2);
        }
    }

    public static /* synthetic */ void setTextInternal$default(IgdsBanner igdsBanner, TextView textView, CharSequence charSequence, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = C18180wK.A0X();
        }
        igdsBanner.setTextInternal(textView, charSequence, bool);
    }

    public final C83594rf getCallback() {
        return this.A00;
    }

    public final void setAction(int i) {
        String str;
        TextView textView = this.A04;
        if (i != 0) {
            str = getContext().getString(i);
        } else {
            str = null;
        }
        setTextInternal(textView, str, C18180wK.A0X());
    }

    public final void setBody(int i) {
        String str;
        TextView textView = this.A05;
        if (i != 0) {
            str = getContext().getString(i);
        } else {
            str = null;
        }
        setTextInternal(textView, str, C18180wK.A0X());
    }

    public final void setBodyColor(int i) {
        this.A05.setTextColor(i);
    }

    public final void setDismissible(boolean z) {
        this.A06.setVisibility(C18190wL.A00(z ? 1 : 0));
    }

    public final void setIcon(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setIconInternal(drawable);
    }

    private final void setTextInternal(TextView textView, CharSequence charSequence, Boolean bool) {
        textView.setText(charSequence);
        CharSequence text = textView.getText();
        int i = 0;
        if (text == null || text.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
        if (C18190wL.A1Z(bool, true)) {
            C18230wP.A16(textView, textView.getContext());
            C18180wK.A0z(textView);
        }
    }

    public final void setDividerColor(int i) {
        int color = getContext().getColor(i);
        this.A02.setBackgroundColor(color);
        this.A01.setBackgroundColor(color);
    }

    public final void setCallback(C83594rf r1) {
        this.A00 = r1;
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        C18190wL.A17(View.inflate(context, R.layout.layout_igds_banner, this));
        setOrientation(1);
        this.A02 = AnonymousClass0wJ.A0I(this, R.id.banner_top_divider);
        this.A03 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.banner_icon);
        this.A05 = (TextView) AnonymousClass0wJ.A0I(this, R.id.banner_body);
        TextView textView = (TextView) AnonymousClass0wJ.A0I(this, R.id.banner_action);
        this.A04 = textView;
        View A0I = AnonymousClass0wJ.A0I(this, R.id.banner_close);
        this.A06 = A0I;
        this.A01 = AnonymousClass0wJ.A0I(this, R.id.banner_bottom_divider);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C29934Fwk.A1K, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(3, 0);
                String A002 = AnonymousClass2LX.A00(context, obtainStyledAttributes, 1);
                String A003 = AnonymousClass2LX.A00(context, obtainStyledAttributes, 0);
                boolean z = obtainStyledAttributes.getBoolean(4, false);
                int i2 = obtainStyledAttributes.getInt(2, 1);
                obtainStyledAttributes.recycle();
                setIcon(resourceId);
                setBody(A002, false);
                setAction((CharSequence) A003);
                setDismissible(z);
                setDividerVisibility(i2);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        AnonymousClass0wJ.A16(textView, 463, this);
        A0I.setContentDescription(context.getString(2131824015));
        AnonymousClass0wJ.A16(A0I, 464, this);
    }

    public final void setAction(CharSequence charSequence) {
        setTextInternal(this.A04, charSequence, C18180wK.A0X());
    }

    public final void setBody(CharSequence charSequence, Boolean bool) {
        setTextInternal(this.A05, charSequence, bool);
    }

    public final void setIcon(Drawable drawable) {
        setIconInternal(drawable);
    }

    public /* synthetic */ IgdsBanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
