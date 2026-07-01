const d = document.getElementById("display");

function a(v) {
    d.value += v;
}

function c() {
    d.value = "";
}

function del() {
    d.value = d.value.slice(0, -1);
}

function eq() {
    try {
        d.value = eval(d.value);
    } catch {
        d.value = "Error";
    }
}