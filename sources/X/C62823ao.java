package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: X.3ao  reason: invalid class name and case insensitive filesystem */
public final class C62823ao {
    public int A00;
    public C18940yC A01;
    public C18950yD A02;
    public C57893Cw A03;
    public AnonymousClass3D5 A04;
    public C18340wi A05;
    public AnonymousClass33R A06;
    public AnonymousClass1Xb A07;
    public AnonymousClass3HX A08;
    public C127397h3 A09;
    public C109326jp A0A;
    public Integer A0B;
    public Integer A0C;
    public boolean A0D = false;
    public final Deque A0E = new ArrayDeque();

    public final void A04(Context context, C84864tz r10, C82374pW r11, Integer num, int i) {
        String str;
        AnonymousClass39N r2 = (AnonymousClass39N) this.A0E.peek();
        if (r2 == null) {
            str = "Cannot push to an empty bottom sheet. Please call open() to show new Screen content in the bottom sheet.";
        } else if (this.A0D) {
            str = "Attempting to push to a dismissing sheet. The content will not be displayed properly";
        } else {
            r2.A02.AHt();
            A01(context, this, r10, r11, num, i);
            return;
        }
        C30967GcS.A02("CDSBloksBottomSheetDelegate", str);
    }

    private void A00(int i) {
        Context context;
        Window window;
        AnonymousClass39N r0 = (AnonymousClass39N) this.A0E.peek();
        if (r0 != null) {
            context = r0.A02.getContext();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getWindow() != null) {
                window = activity.getWindow();
            } else {
                return;
            }
        } else {
            C18340wi r02 = this.A05;
            if (r02 == null || (window = r02.getWindow()) == null) {
                return;
            }
        }
        window.setSoftInputMode(i);
    }

    public static void A01(Context context, C62823ao r3, C84864tz r4, C82374pW r5, Integer num, int i) {
        int i2;
        if (r3.A01 != null) {
            AnonymousClass51X.A02(r4.AZg(context), r3.A01.A01, num, true);
            LLH Ame = r4.Ame();
            C18940yC r0 = r3.A01;
            if (r0 != null) {
                ViewGroup viewGroup = r0.A00;
                viewGroup.removeAllViews();
                viewGroup.addView(Ame);
            }
            AnonymousClass39N r1 = new AnonymousClass39N(r4, r5, i);
            Deque deque = r3.A0E;
            deque.push(r1);
            AnonymousClass39N r02 = (AnonymousClass39N) deque.peek();
            if (r02 == null) {
                C30967GcS.A02("CDSBloksBottomSheetDelegate", "Attempting to check the current keyboard soft input mode but found null.");
                i2 = 32;
            } else {
                i2 = r02.A01;
            }
            r3.A00(i2);
            return;
        }
        throw C18180wK.A0a("Cannot push Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
    }

    public static void A02(Context context, C62823ao r6, Integer num) {
        int i;
        Deque deque = r6.A0E;
        AnonymousClass39N r3 = (AnonymousClass39N) deque.pop();
        AnonymousClass39N r0 = (AnonymousClass39N) deque.peek();
        if (r0 == null) {
            C30967GcS.A02("CDSBloksBottomSheetDelegate", "Attempting to check the current keyboard soft input mode but found null.");
            i = 32;
        } else {
            i = r0.A01;
        }
        r6.A00(i);
        C18940yC r02 = r6.A01;
        if (r02 != null) {
            View primaryChild = r02.A01.getPrimaryChild();
            if (primaryChild != null) {
                C84864tz r1 = r3.A02;
                r1.AHt();
                primaryChild.addOnAttachStateChangeListener(new C64563mY(r1));
                AnonymousClass39N r32 = (AnonymousClass39N) deque.peek();
                if (r32 == null) {
                    throw C18180wK.A0a("Cannot pop Screen content with an empty CDS bottom sheet or full screen.");
                } else if (r6.A01 != null) {
                    AnonymousClass3D5 r2 = r6.A04;
                    if (r2 != null) {
                        r2.A03.post(new AnonymousClass4O9(r2));
                    }
                    C57893Cw r22 = r6.A03;
                    if (r22 != null) {
                        r22.A02.post(new AnonymousClass4O8(r22));
                    }
                    C84864tz r33 = r32.A02;
                    AnonymousClass51X.A02(r33.AZg(context), r6.A01.A01, num, false);
                    LLH Ame = r33.Ame();
                    C18940yC r03 = r6.A01;
                    if (r03 != null) {
                        ViewGroup viewGroup = r03.A00;
                        viewGroup.removeAllViews();
                        viewGroup.addView(Ame);
                    }
                } else {
                    throw C18180wK.A0a("Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
                }
            } else {
                throw C18180wK.A0a("Bottom sheet layout pager must have a non-null view.");
            }
        } else {
            throw C18180wK.A0a("Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
        }
    }

    public final void A03(Context context) {
        AnonymousClass33R r0;
        C82374pW r02;
        C18940yC r03 = this.A01;
        if (!(r03 == null || r03.getVisibility() == 0)) {
            this.A01.setVisibility(0);
        }
        Deque deque = this.A0E;
        AnonymousClass39N r04 = (AnonymousClass39N) deque.peek();
        if (r04 != null && (r02 = r04.A00) != null) {
            r02.onBackInvoked();
        } else if (deque.size() > 1) {
            A02(context, this, (Integer) null);
        } else if (this.A0B != AnonymousClass006.A0N || (r0 = this.A06) == null) {
            C18340wi r05 = this.A05;
            if (r05 != null) {
                r05.dismiss();
            }
        } else {
            AnonymousClass1Xb.A02(r0.A00);
        }
    }

    public final void A05(Context context, C84864tz r13, Integer num, String str) {
        String str2;
        Deque<AnonymousClass39N> deque = this.A0E;
        if (deque.isEmpty() || this.A01 == null) {
            str2 = "Cannot replace from an empty bottom sheet.";
        } else {
            AnonymousClass39N r1 = (AnonymousClass39N) deque.peekFirst();
            if (r1 == null) {
                str2 = "Invalid screen state. Cannot have a null screen.";
            } else {
                C84864tz r7 = r13;
                if (str == null || C84864tz.A00(r1, str)) {
                    A04(context, r7, (C82374pW) null, num, 32);
                    A08(r1.A02.ATg());
                    return;
                } else if (deque.isEmpty()) {
                    str2 = "Attempting to replace a Screen when the stack is empty. The new screen was not added.";
                } else {
                    int i = 0;
                    for (AnonymousClass39N A002 : deque) {
                        if (C84864tz.A00(A002, str)) {
                            ArrayList A0s = C18200wM.A0s(deque);
                            A0s.set(i, new AnonymousClass39N(r13, (C82374pW) null, 32));
                            deque.clear();
                            deque.addAll(A0s);
                            return;
                        }
                        i++;
                    }
                    str2 = "Attempting to replace a Screen with an invalid screen ID. The new screen was not added.";
                }
            }
        }
        C30967GcS.A02("CDSBloksBottomSheetDelegate", str2);
    }

    public final void A06(Context context, Integer num, String str) {
        String str2;
        Deque<AnonymousClass39N> deque = this.A0E;
        AnonymousClass39N r0 = (AnonymousClass39N) deque.peekFirst();
        if (r0 == null || C84864tz.A00(r0, str)) {
            str2 = "Attempting to pop to the current screen in the CDS bottom sheet, so no pop action was performed. This is a no-op.";
        } else {
            int i = 0;
            for (AnonymousClass39N A002 : deque) {
                if (!C84864tz.A00(A002, str)) {
                    i++;
                } else {
                    for (int i2 = 0; i2 < i; i2++) {
                        A02(context, this, num);
                    }
                    return;
                }
            }
            str2 = "No screen found with target ID, so no screens were popped.";
        }
        C30967GcS.A02("CDSBloksBottomSheetDelegate", str2);
    }

    public final void A07(C84864tz r6, C82374pW r7, String str, int i) {
        String str2;
        Deque<AnonymousClass39N> deque = this.A0E;
        if (deque.isEmpty()) {
            str2 = "Attempting to insert a new Screen when the stack is empty. The new screen was not added.";
        } else {
            AnonymousClass39N r0 = (AnonymousClass39N) deque.peekLast();
            if (r0 == null || !C84864tz.A00(r0, str)) {
                int i2 = 0;
                for (AnonymousClass39N r02 : deque) {
                    i2++;
                    if (str.equals(r02.A02.ATg())) {
                        ArrayList A0s = C18200wM.A0s(deque);
                        A0s.add(i2, new AnonymousClass39N(r6, r7, i));
                        deque.clear();
                        deque.addAll(A0s);
                        return;
                    }
                }
                str2 = "Attempting to insert a new Screen insert before with an invalid screen ID. The new screen was not added.";
            } else {
                str2 = "Attempting to insert a new Screen insert before the root screen in the stack. The new screen was not added.";
            }
        }
        C30967GcS.A02("CDSBloksBottomSheetDelegate", str2);
    }

    public final void A08(String str) {
        String str2;
        Deque deque = this.A0E;
        AnonymousClass39N r0 = (AnonymousClass39N) deque.peekFirst();
        if (r0 == null || C84864tz.A00(r0, str)) {
            str2 = "Attempting to remove the current or only screen in the CDS bottom sheet, so the screen was not removed. Please use pop or dismiss instead.";
        } else {
            Iterator it = deque.iterator();
            while (it.hasNext()) {
                C84864tz r1 = ((AnonymousClass39N) it.next()).A02;
                if (str.equals(r1.ATg())) {
                    r1.destroy();
                    it.remove();
                    return;
                }
            }
            str2 = "No screen found with target ID, so the screen was not removed.";
        }
        C30967GcS.A02("CDSBloksBottomSheetDelegate", str2);
    }
}
