require xorg-driver-input.inc
DESCRIPTION = "X.Org X server -- keyboard input driver"
DEPENDS += " kbproto"
PE = "1"
PR = "${INC_PR}.1"

SRC_URI[archive.md5sum] = "fd17158ffeacecc8cc670604460cb98b"
SRC_URI[archive.sha256sum] = "842d36cfca68ddab4f2c562c73bfd43ba76de2d490d60034f0c5dd524aa6d6a5"
