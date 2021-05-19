package de.jonas.japplication.graphics;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * In einem {@link WindowType} werden alle Informationen gespeichert, um ein {@link GUI} zu instanziieren.
 */
@RequiredArgsConstructor
public final class WindowType {
    //<editor-fold desc="LOCAL FIELDS">
    /** Der Titel des Fensters. */
    @Getter
    private final String title;
    /** Die Breite des Fensters. */
    @Getter
    private final int width;
    /** Die Höhe des Fensters. */
    @Getter
    private final int height;
    /** Der Zustand, ob das Fenster dekoriert ist, oder nicht. */
    @Getter
    private final boolean decorated;
    /** Der Zustand, ob das Fenster konstant neu gezeichnet werden soll. */
    @Getter
    private final boolean repaint;
    //</editor-fold>
}
