#!/usr/bin/env bash
# SPDX-License-Identifier: MIT

cd `dirname $0`
../shared/scripts/20-push-image.sh "$1" "$2" "$3"