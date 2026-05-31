[PYTHON]
def is_blank(my_str):
    return my_str.strip() == ""
[/PYTHON]
[JAVASCRIPT]
function isBlank(str) {
    return !str.trim().length;
}
[/JAVASCRIPT]
[PHP]
function isBlank($myStr)
{
    return trim($myStr) === '';
}
[/PHP]