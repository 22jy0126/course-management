const isLogin = () => {
    axios({
        method: "GET",
        url: "/user/login/info",
        withCredentials: true,
    })
        .then((res = {}) => {
            const {
                data: {
                    code = ""
                } = {},
            } = res;
            if (code == "80001") {
                location.href = "login.html";
                return false;
            }
        });
    return true;
}