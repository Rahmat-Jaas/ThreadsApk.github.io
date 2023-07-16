package X;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.Reference;
import java.util.List;

/* renamed from: X.7S0  reason: invalid class name */
public final class AnonymousClass7S0 implements InputConnection {
    public int A00;
    public int A01;
    public AnonymousClass7HD A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass8d9 A05;
    public final List A06;
    public final boolean A07 = true;

    public AnonymousClass7S0(AnonymousClass8d9 r3, AnonymousClass7HD r4) {
        this.A05 = r3;
        this.A02 = r4;
        this.A06 = AnonymousClass0wJ.A0v();
        this.A04 = true;
    }

    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.A03 = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.A01 = i2;
        }
        return AnonymousClass6FV.A00(this.A02);
    }

    public final Handler getHandler() {
        return null;
    }

    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        C04220Ms.A0B(keyEvent, 0);
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C123877Yx) this.A05).A00.A0C.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    private final void A00(C143088g5 r2) {
        this.A00++;
        try {
            this.A06.add(r2);
        } finally {
            A01();
        }
    }

    private final boolean A01() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            List list = this.A06;
            if (C18190wL.A1a(list)) {
                ((C123877Yx) this.A05).A00.A05.invoke(C18200wM.A0s(list));
                list.clear();
            }
        }
        if (this.A00 <= 0) {
            return false;
        }
        return true;
    }

    public final boolean beginBatchEdit() {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        this.A00++;
        return true;
    }

    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    public final void closeConnection() {
        this.A06.clear();
        this.A00 = 0;
        this.A04 = false;
        List list = ((C123877Yx) this.A05).A00.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (C04220Ms.A0I(((Reference) list.get(i)).get(), this)) {
                list.remove(i);
                return;
            }
        }
    }

    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.A04;
        if (z) {
            return true;
        }
        return z;
    }

    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.A04;
        if (z) {
            String valueOf = String.valueOf(charSequence);
            C04220Ms.A0B(valueOf, 1);
            A00(new C123797Yp(C134747yH.A04(valueOf), i));
        }
        return z;
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(new C123807Yq(i, i2));
        return true;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(new C123817Yr(i, i2));
        return true;
    }

    public final boolean finishComposingText() {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(new C123787Yo());
        return true;
    }

    public final int getCursorCapsMode(int i) {
        AnonymousClass7HD r1 = this.A02;
        return TextUtils.getCapsMode(r1.A01.A00, C121767Ia.A01(r1.A00), i);
    }

    public final CharSequence getSelectedText(int i) {
        AnonymousClass7HD r2 = this.A02;
        if (C121767Ia.A02(r2.A00)) {
            return null;
        }
        C134747yH r4 = r2.A01;
        long j = r2.A00;
        return r4.subSequence(C121767Ia.A01(j), C121767Ia.A00(j)).toString();
    }

    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AnonymousClass6FW.A00(this.A02, i).toString();
    }

    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return C134747yH.A03(this.A02, i).toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        sendKeyEvent(new android.view.KeyEvent(0, r2));
        sendKeyEvent(new android.view.KeyEvent(1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean performContextMenuAction(int r5) {
        /*
            r4 = this;
            boolean r3 = r4.A04
            if (r3 == 0) goto L_0x0008
            r3 = 0
            switch(r5) {
                case 16908319: goto L_0x0023;
                case 16908320: goto L_0x000f;
                case 16908321: goto L_0x000c;
                case 16908322: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r3
        L_0x0009:
            r2 = 279(0x117, float:3.91E-43)
            goto L_0x0011
        L_0x000c:
            r2 = 278(0x116, float:3.9E-43)
            goto L_0x0011
        L_0x000f:
            r2 = 277(0x115, float:3.88E-43)
        L_0x0011:
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r0.<init>(r3, r2)
            r4.sendKeyEvent(r0)
            r1 = 1
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r0.<init>(r1, r2)
            r4.sendKeyEvent(r0)
            return r3
        L_0x0023:
            X.7HD r0 = r4.A02
            X.7yH r0 = r0.A01
            int r1 = X.C134747yH.A02(r0)
            X.7Yu r0 = new X.7Yu
            r0.<init>(r3, r1)
            r4.A00(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S0.performContextMenuAction(int):boolean");
    }

    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 5;
                    break;
                default:
                    Log.w("RecordingIC", AnonymousClass00U.A0J("IME sends unsupported Editor Action: ", i));
                    break;
            }
        }
        i2 = 1;
        ((C123877Yx) this.A05).A00.A06.invoke(new C114256sw(i2));
        return true;
    }

    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.A04;
        if (z) {
            return true;
        }
        return z;
    }

    public final boolean requestCursorUpdates(int i) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        Log.w("RecordingIC", "requestCursorUpdates is not supported");
        return false;
    }

    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.A04;
        if (z) {
            A00(new C123827Ys(i, i2));
        }
        return z;
    }

    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.A04;
        if (z) {
            A00(new C123837Yt(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final boolean setSelection(int i, int i2) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(new C123847Yu(i, i2));
        return true;
    }

    public final boolean endBatchEdit() {
        return A01();
    }
}
