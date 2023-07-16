package X;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: X.506  reason: invalid class name */
public final class AnonymousClass506 extends ActionMode.Callback2 {
    public final AnonymousClass7Dg A00;

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        AnonymousClass0ZU r0;
        AnonymousClass7Dg r2 = this.A00;
        C04220Ms.A0A(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            r0 = r2.A01;
        } else if (itemId == 1) {
            r0 = r2.A03;
        } else if (itemId == 2) {
            r0 = r2.A02;
        } else if (itemId != 3) {
            return false;
        } else {
            r0 = r2.A04;
        }
        if (r0 != null) {
            r0.invoke();
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        AnonymousClass7Dg r1 = this.A00;
        if (menu == null) {
            throw C18190wL.A0a("Required value was null.");
        } else if (actionMode != null) {
            if (r1.A01 != null) {
                AnonymousClass7Dg.A00(menu, AnonymousClass006.A00);
            }
            if (r1.A03 != null) {
                AnonymousClass7Dg.A00(menu, AnonymousClass006.A01);
            }
            if (r1.A02 != null) {
                AnonymousClass7Dg.A00(menu, AnonymousClass006.A0C);
            }
            if (r1.A04 == null) {
                return true;
            }
            AnonymousClass7Dg.A00(menu, AnonymousClass006.A0N);
            return true;
        } else {
            throw C18190wL.A0a("Required value was null.");
        }
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        AnonymousClass0ZU r0 = this.A00.A05;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        AnonymousClass7F6 r4 = this.A00.A00;
        if (rect != null) {
            rect.set((int) r4.A01, (int) r4.A03, (int) r4.A02, (int) r4.A00);
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        AnonymousClass7Dg r2 = this.A00;
        if (actionMode == null || menu == null) {
            return false;
        }
        Integer num = AnonymousClass006.A00;
        if (r2.A01 != null) {
            if (menu.findItem(0) == null) {
                AnonymousClass7Dg.A00(menu, num);
            }
        } else if (menu.findItem(0) != null) {
            menu.removeItem(0);
        }
        Integer num2 = AnonymousClass006.A01;
        if (r2.A03 != null) {
            if (menu.findItem(1) == null) {
                AnonymousClass7Dg.A00(menu, num2);
            }
        } else if (menu.findItem(1) != null) {
            menu.removeItem(1);
        }
        Integer num3 = AnonymousClass006.A0C;
        if (r2.A02 != null) {
            if (menu.findItem(2) == null) {
                AnonymousClass7Dg.A00(menu, num3);
            }
        } else if (menu.findItem(2) != null) {
            menu.removeItem(2);
        }
        Integer num4 = AnonymousClass006.A0N;
        if (r2.A04 != null) {
            if (menu.findItem(3) != null) {
                return true;
            }
            AnonymousClass7Dg.A00(menu, num4);
            return true;
        } else if (menu.findItem(3) == null) {
            return true;
        } else {
            menu.removeItem(3);
            return true;
        }
    }

    public AnonymousClass506(AnonymousClass7Dg r1) {
        this.A00 = r1;
    }
}
