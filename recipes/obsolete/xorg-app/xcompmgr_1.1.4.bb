require xorg-app-common.inc
DESCRIPTION = "X Compositing Manager"
PRIORITY = "optional"
LICENSE = "BSD-X"
DEPENDS += "libxdamage libxcomposite libxrender"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "3eb1c2b7a6ceaec4ee872cb06d202d91"
SRC_URI[archive.sha256sum] = "4bf647745b4de940ef75796fc8ad4e1f83c276e474f7b6779f317fcd070de884"
