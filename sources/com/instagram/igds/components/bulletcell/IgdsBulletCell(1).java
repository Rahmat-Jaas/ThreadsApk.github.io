package com.instagram.igds.components.bulletcell;

import X.AnonymousClass0wJ;
import X.AnonymousClass256;
import X.AnonymousClass2LX;
import X.AnonymousClass8bQ;
import X.C04220Ms;
import X.C09860go;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18240wQ;
import X.C29934Fwk;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsBulletCell extends FrameLayout {
    public AnonymousClass256 A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final ViewGroup A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsBulletCell(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public final void setIcon(Drawable drawable) {
        C04220Ms.A0B(drawable, 0);
        this.A01.setImageDrawable(drawable);
    }

    public final void setSurfaceType(AnonymousClass256 r5) {
        int i;
        C04220Ms.A0B(r5, 0);
        if (this.A00 != r5) {
            this.A00 = r5;
            ImageView imageView = this.A01;
            Context context = getContext();
            C18240wQ.A0r(context, imageView, r5.A00);
            TextView textView = this.A03;
            C18180wK.A0s(context, textView, this.A00.A01);
            TextView textView2 = this.A02;
            int visibility = textView.getVisibility();
            AnonymousClass256 r0 = this.A00;
            if (visibility == 0) {
                i = r0.A02;
            } else {
                i = r0.A01;
            }
            C18180wK.A0s(context, textView2, i);
        }
    }

    public final void setText(Integer num, Integer num2) {
        String str;
        int intValue;
        int intValue2;
        String str2 = null;
        if (num == null || (intValue2 = num.intValue()) == 0) {
            str = null;
        } else {
            str = getContext().getString(intValue2);
        }
        if (!(num2 == null || (intValue = num2.intValue()) == 0)) {
            str2 = getContext().getString(intValue);
        }
        setText((CharSequence) str, (CharSequence) str2);
    }

    private final void A00(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        Context context;
        int i;
        TextView textView = this.A03;
        textView.setText(charSequence);
        TextView textView2 = this.A02;
        textView2.setText(charSequence2);
        CharSequence text = textView.getText();
        C04220Ms.A06(text);
        boolean z2 = !AnonymousClass8bQ.A0n(text);
        CharSequence text2 = textView2.getText();
        C04220Ms.A06(text2);
        boolean z3 = !AnonymousClass8bQ.A0n(text2);
        if (z3 && z2) {
            textView.setVisibility(0);
            Context context2 = textView.getContext();
            C09860go.A0b(textView, (int) C09860go.A00(context2, 12.0f), (int) C09860go.A00(context2, 5.0f));
            textView2.setVisibility(0);
            context = textView2.getContext();
            C09860go.A0Q(textView2, (int) C09860go.A00(context, 12.0f));
            i = this.A00.A02;
        } else if (z2) {
            textView.setVisibility(0);
            Context context3 = textView.getContext();
            C09860go.A0b(textView, (int) C09860go.A00(context3, 13.0f), (int) C09860go.A00(context3, 13.0f));
            textView2.setVisibility(8);
            return;
        } else if (z3) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            context = textView2.getContext();
            C09860go.A0b(textView2, (int) C09860go.A00(context, 13.0f), (int) C09860go.A00(context, 13.0f));
            i = this.A00.A01;
        } else if (!z) {
            throw C18190wL.A0a("Bullet text must have either title or body text.");
        } else {
            return;
        }
        C18180wK.A0s(context, textView2, i);
    }

    public static /* synthetic */ void setIconInternal$default(IgdsBulletCell igdsBulletCell, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (i != 0) {
            igdsBulletCell.A01.setImageResource(i);
        } else if (!z) {
            throw C18190wL.A0a("Bullet Cell must have a valid icon resource");
        }
    }

    public static /* synthetic */ void setTextInternal$default(IgdsBulletCell igdsBulletCell, CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        igdsBulletCell.A00(charSequence, charSequence2, z);
    }

    public final AnonymousClass256 getSurfaceType() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.getPaddingRight() != 0) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setExcludeHorizontalPadding(boolean r5) {
        /*
            r4 = this;
            android.view.ViewGroup r3 = r4.A04
            int r0 = r3.getPaddingLeft()
            r2 = 0
            if (r0 != 0) goto L_0x0010
            int r1 = r3.getPaddingRight()
            r0 = 0
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r5 == 0) goto L_0x0019
            if (r0 == 0) goto L_0x0018
        L_0x0015:
            X.C09860go.A0a(r3, r2, r2)
        L_0x0018:
            return
        L_0x0019:
            if (r0 != 0) goto L_0x0018
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            int r2 = r1.getDimensionPixelSize(r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bulletcell.IgdsBulletCell.setExcludeHorizontalPadding(boolean):void");
    }

    public final void setMovementMethod(MovementMethod movementMethod, MovementMethod movementMethod2) {
        this.A03.setMovementMethod(movementMethod);
        this.A02.setMovementMethod(movementMethod2);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsBulletCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        AnonymousClass256 r8 = AnonymousClass256.DEFAULT;
        this.A00 = r8;
        View.inflate(context, R.layout.layout_bullet_cell, this);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass0wJ.A0I(this, R.id.bullet_cell_container);
        this.A04 = viewGroup;
        this.A01 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.bullet_cell_icon);
        this.A03 = (TextView) AnonymousClass0wJ.A0I(this, R.id.bullet_cell_title);
        this.A02 = (TextView) AnonymousClass0wJ.A0I(this, R.id.bullet_cell_body);
        viewGroup.setImportantForAccessibility(1);
        viewGroup.setDescendantFocusability(393216);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C29934Fwk.A1L, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(2, 0);
                String A002 = AnonymousClass2LX.A00(context, obtainStyledAttributes, 4);
                String A003 = AnonymousClass2LX.A00(context, obtainStyledAttributes, 0);
                boolean z = obtainStyledAttributes.getBoolean(1, false);
                int i2 = obtainStyledAttributes.getInt(3, 0);
                if (i2 != 0 && i2 == 1) {
                    r8 = AnonymousClass256.ON_MEDIA;
                }
                setSurfaceType(r8);
                obtainStyledAttributes.recycle();
                setExcludeHorizontalPadding(z);
                if (resourceId != 0) {
                    this.A01.setImageResource(resourceId);
                }
                A00(A002, A003, true);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public final void setIcon(int i) {
        setIconInternal$default(this, i, false, 2, (Object) null);
    }

    public final void setText(CharSequence charSequence, CharSequence charSequence2) {
        A00(charSequence, charSequence2, false);
    }

    public /* synthetic */ IgdsBulletCell(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsBulletCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
