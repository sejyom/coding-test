def solution(phone_number):
    return str((len(phone_number)-4) * "*" + phone_number[len(phone_number)-4:])