require gstreamer1.0-libav.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://COPYING.LIB;md5=6762ed442b3822387a51c92d928ead0d \
                    file://ext/libav/gstav.h;beginline=1;endline=18;md5=a752c35267d8276fd9ca3db6994fca9c \
                    file://gst-libs/ext/libav/COPYING.GPLv2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://gst-libs/ext/libav/COPYING.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
                    file://gst-libs/ext/libav/COPYING.LGPLv2.1;md5=bd7a443320af8c812e4c18d1b79df004 \
                    file://gst-libs/ext/libav/COPYING.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "http://gstreamer.freedesktop.org/src/gst-libav/gst-libav-${PV}.tar.xz \
           file://0001-Disable-yasm-for-libav-when-disable-yasm.patch \
           file://workaround-to-build-gst-libav-for-i586-with-gcc.patch \
           file://mips64_cpu_detection.patch \
           file://0001-configure-check-for-armv7ve-variant.patch \
           "
SRC_URI[md5sum] = "f9c4593947f8484b237c5d9782939ec3"
SRC_URI[sha256sum] = "39d1477f642ee980b008e78d716b16801eec9a6e5958c5a6cdc0cb04ab0750c4"

S = "${WORKDIR}/gst-libav-${PV}"
