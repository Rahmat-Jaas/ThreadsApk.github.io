package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.forker.Process;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.ui.widget.textview.IgTextLayoutView;

/* renamed from: X.55p  reason: invalid class name and case insensitive filesystem */
public abstract class C879855p extends C008703u {
    public int A00 = Process.WAIT_RESULT_TIMEOUT;
    public int A01 = Process.WAIT_RESULT_TIMEOUT;
    public final View A02;
    public final AccessibilityManager A03;

    public final AccessibilityNodeInfoCompat A00(int i) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        int i2;
        if (i != -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.A02, i);
            if (obtain != null) {
                accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat((Object) obtain);
            } else {
                accessibilityNodeInfoCompat = null;
            }
            A06(accessibilityNodeInfoCompat, i);
            if (this.A00 == i) {
                accessibilityNodeInfoCompat.A02.setAccessibilityFocused(true);
                i2 = 128;
            } else {
                accessibilityNodeInfoCompat.A02.setAccessibilityFocused(false);
                i2 = 64;
            }
            accessibilityNodeInfoCompat.A06(i2);
            return accessibilityNodeInfoCompat;
        }
        View view = this.A02;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(view));
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat2.A02);
        A05(accessibilityNodeInfoCompat2);
        return accessibilityNodeInfoCompat2;
    }

    public final boolean A02(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        if (i == -1) {
            return this.A02.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = this.A03;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = this.A00) == i) {
                return false;
            }
            if (i3 == i3) {
                this.A00 = Process.WAIT_RESULT_TIMEOUT;
                this.A02.invalidate();
                A04(i3, Constants.LOAD_RESULT_PGO_ATTEMPTED);
            }
            this.A00 = i;
            this.A02.invalidate();
            i4 = 32768;
        } else if (i2 != 128 || this.A00 != i) {
            return false;
        } else {
            this.A00 = Process.WAIT_RESULT_TIMEOUT;
            this.A02.invalidate();
            i4 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
        }
        A04(i, i4);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(float r8, float r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass5yD
            if (r0 == 0) goto L_0x005e
            android.view.View r0 = r7.A02
            com.instagram.ui.widget.textview.IgTextLayoutView r0 = (com.instagram.ui.widget.textview.IgTextLayoutView) r0
            android.text.Layout r4 = r0.A00
        L_0x000a:
            int r2 = (int) r8
            int r1 = (int) r9
        L_0x000c:
            if (r4 == 0) goto L_0x0092
            java.lang.CharSequence r6 = r4.getText()
            boolean r0 = r6 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0092
            r5 = 0
            int r0 = r4.getLineTop(r5)
            if (r1 < r0) goto L_0x0092
            int r0 = r4.getLineCount()
            int r0 = r0 + -1
            int r0 = r4.getLineBottom(r0)
            if (r1 >= r0) goto L_0x0092
            int r3 = r4.getLineForVertical(r1)
            float r1 = (float) r2
            float r0 = r4.getLineLeft(r3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0092
            float r0 = r4.getLineRight(r3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0092
            int r1 = r4.getOffsetForHorizontal(r3, r1)
            android.text.Spanned r6 = (android.text.Spanned) r6
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r1 = r6.getSpans(r1, r1, r0)
            android.text.style.ClickableSpan[] r1 = (android.text.style.ClickableSpan[]) r1
            int r0 = r1.length
            if (r0 == 0) goto L_0x0092
            r1 = r1[r5]
            if (r1 == 0) goto L_0x0092
            java.lang.CharSequence r0 = r4.getText()
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r1 = r0.getSpanStart(r1)
        L_0x005d:
            return r1
        L_0x005e:
            boolean r0 = r7 instanceof X.AnonymousClass5yE
            if (r0 == 0) goto L_0x0078
            android.view.View r1 = r7.A02
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0075
            boolean r0 = r1.A06(r8)
            r1 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r0 != 0) goto L_0x005d
        L_0x0075:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            return r1
        L_0x0078:
            boolean r0 = r7 instanceof X.AnonymousClass5yC
            android.view.View r3 = r7.A02
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.text.Layout r4 = r3.getLayout()
            if (r0 != 0) goto L_0x000a
            int r2 = (int) r8
            int r0 = r3.getPaddingLeft()
            int r2 = r2 - r0
            int r1 = (int) r9
            int r0 = r3.getPaddingTop()
            int r1 = r1 - r0
            goto L_0x000c
        L_0x0092:
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879855p.A03(float, float):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r4.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(int r5, int r6) {
        /*
            r4 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L_0x0021
            android.view.accessibility.AccessibilityManager r0 = r4.A03
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0021
            android.view.View r3 = r4.A02
            android.view.ViewParent r2 = r3.getParent()
            if (r2 == 0) goto L_0x0021
            r1 = -1
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain(r6)
            if (r5 == r1) goto L_0x0022
            r0.setSource(r3, r5)
        L_0x001e:
            r2.requestSendAccessibilityEvent(r3, r0)
        L_0x0021:
            return
        L_0x0022:
            r3.onInitializeAccessibilityEvent(r0)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879855p.A04(int, int):void");
    }

    public void A05(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        View view;
        Layout layout;
        if (this instanceof AnonymousClass5yD) {
            view = this.A02;
            layout = ((IgTextLayoutView) view).A00;
        } else if (this instanceof AnonymousClass5yE) {
            View view2 = this.A02;
            if (((SearchEditText) view2).A05()) {
                accessibilityNodeInfoCompat.A02.addChild(view2, Process.WAIT_RESULT_STOPPED);
                return;
            }
            return;
        } else {
            view = this.A02;
            layout = ((TextView) view).getLayout();
        }
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                for (ClickableSpan spanStart : (ClickableSpan[]) spanned.getSpans(0, text.length(), ClickableSpan.class)) {
                    accessibilityNodeInfoCompat.A02.addChild(view, spanned.getSpanStart(spanStart));
                }
            }
        }
    }

    public void A06(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        View view;
        Layout layout;
        boolean z;
        Rect rect;
        AccessibilityNodeInfo accessibilityNodeInfo;
        if (this instanceof AnonymousClass5yD) {
            view = this.A02;
            layout = ((IgTextLayoutView) view).A00;
        } else if (this instanceof AnonymousClass5yE) {
            AnonymousClass5yE r1 = (AnonymousClass5yE) this;
            if (i == -2147483647) {
                View view2 = r1.A02;
                SearchEditText searchEditText = (SearchEditText) view2;
                if (searchEditText.A05()) {
                    int clearButtonWidth = searchEditText.getClearButtonWidth();
                    int clearButtonHeight = searchEditText.getClearButtonHeight();
                    int[] iArr = AnonymousClass5yE.A02;
                    searchEditText.getLocationOnScreen(iArr);
                    z = true;
                    int height = iArr[1] + ((searchEditText.getHeight() - clearButtonHeight) >> 1);
                    boolean z2 = r1.A00;
                    int i2 = iArr[0];
                    if (z2) {
                        int paddingLeft = i2 + searchEditText.getPaddingLeft();
                        rect = AnonymousClass5yE.A01;
                        rect.set(paddingLeft, height, clearButtonWidth + paddingLeft, clearButtonHeight + height);
                    } else {
                        int width = (i2 + searchEditText.getWidth()) - searchEditText.getPaddingRight();
                        rect = AnonymousClass5yE.A01;
                        rect.set(width - clearButtonWidth, height, width, clearButtonHeight + height);
                    }
                    accessibilityNodeInfoCompat.A07(view2);
                    accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
                    accessibilityNodeInfo.setBoundsInScreen(rect);
                    accessibilityNodeInfoCompat.A0B(searchEditText.getResources().getString(2131823329));
                    accessibilityNodeInfoCompat.A0A("android.widget.Button");
                    accessibilityNodeInfo.setVisibleToUser(true);
                    accessibilityNodeInfo.setFocusable(z);
                    accessibilityNodeInfoCompat.A0G(z);
                    accessibilityNodeInfo.setEnabled(z);
                }
                return;
            }
            return;
        } else {
            view = this.A02;
            layout = ((TextView) view).getLayout();
        }
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(i, i, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    ClickableSpan clickableSpan = clickableSpanArr[0];
                    int spanStart = spanned.getSpanStart(clickableSpan);
                    int spanEnd = spanned.getSpanEnd(clickableSpan);
                    int lineForOffset = layout.getLineForOffset(spanStart);
                    z = true;
                    boolean A1T = C86114wI.A1T(lineForOffset, layout.getLineForOffset(spanEnd));
                    accessibilityNodeInfoCompat.A07(view);
                    if (clickableSpan instanceof C87004zg) {
                        C87004zg r2 = (C87004zg) clickableSpan;
                        CharSequence charSequence = r2.A02;
                        if (charSequence == null) {
                            charSequence = spanned.subSequence(spanStart, spanEnd);
                        }
                        accessibilityNodeInfoCompat.A0B(charSequence);
                        Integer num = r2.A01;
                        if (num == null) {
                            num = AnonymousClass006.A01;
                        }
                        accessibilityNodeInfoCompat.A0A(C116146wV.A01(num));
                        C008103m r0 = r2.A00;
                        if (r0 != null) {
                            accessibilityNodeInfoCompat.A08(r0);
                        }
                    } else {
                        accessibilityNodeInfoCompat.A0B(spanned.subSequence(spanStart, spanEnd));
                    }
                    accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
                    accessibilityNodeInfo.setVisibleToUser(true);
                    if (A1T) {
                        spanEnd = layout.getLineVisibleEnd(lineForOffset);
                    }
                    Path path = C103756ag.A00;
                    layout.getSelectionPath(spanStart, spanEnd, path);
                    RectF rectF = C103756ag.A02;
                    path.computeBounds(rectF, true);
                    int[] iArr2 = C103756ag.A03;
                    view.getLocationOnScreen(iArr2);
                    int paddingLeft2 = iArr2[0] + view.getPaddingLeft();
                    int paddingTop = iArr2[1] + view.getPaddingTop();
                    Rect rect2 = C103756ag.A01;
                    rect2.set(((int) rectF.left) + paddingLeft2, ((int) rectF.top) + paddingTop, paddingLeft2 + ((int) rectF.right), paddingTop + ((int) rectF.bottom));
                    accessibilityNodeInfo.setBoundsInScreen(rect2);
                    accessibilityNodeInfo.setFocusable(z);
                    accessibilityNodeInfoCompat.A0G(z);
                    accessibilityNodeInfo.setEnabled(z);
                }
            }
        }
    }

    public final boolean A07(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.A03;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int A032 = A03(motionEvent.getX(), motionEvent.getY());
            int i = this.A01;
            if (i != A032) {
                this.A01 = A032;
                A04(A032, 128);
                A04(i, 256);
            }
            if (A032 != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10) {
            return false;
        } else {
            int i2 = this.A01;
            if (i2 != Integer.MIN_VALUE) {
                this.A01 = Process.WAIT_RESULT_TIMEOUT;
                A04(i2, 256);
            }
            return true;
        }
    }

    public C879855p(View view) {
        this.A02 = view;
        this.A03 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
    }
}
